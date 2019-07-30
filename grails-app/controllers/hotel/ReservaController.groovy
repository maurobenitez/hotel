package hotel

class ReservaController {

    def index() {
    	[reservas: Hotel.getInstance().getReservas()]
    }

    def show(){
    	[reserva:Reserva.get(params.id)]
    }

    def asignar(){
    	def reserva1=Reserva.get(params.id)
        def automovil1=reserva1.reservaAutomovil.automovil
        def habitaciones1=Reserva.findAll{
            ((fecha_inicio>=reserva1.fecha_inicio)&&(fecha_inicio<=reserva1.fecha_fin)) && estado=="asignado"
        }.habitacion
        def habitacion2=Habitacion.findAll{
            plazas<reserva1.cant_huespedes
        }
        def habitaciones=Habitacion.list()
        habitaciones.removeAll(habitaciones1)
        habitaciones.removeAll(habitacion2)
        def autosDisponibles=ReservaAutomovil.findAll{
            (fecha_inicio>=reserva1.fecha_inicio)&&(fecha_inicio<=reserva1.fecha_fin)&&(automovil==automovil1)&&(estado=="asignado")
        }
        if (autosDisponibles!=null){
            if (automovil1.cantidad-autosDisponibles.size()==0){
                flash.noAutosDisponibles=true
            }
        }
    	[habitaciones:habitaciones, reserva:reserva1,automovil:reserva1.reservaAutomovil.automovil]
    }

    def save(){
        def hotel=Hotel.getInstance()
        hotel.save()
        def habitacion=Habitacion.get(params.habitacion)
        def automovil=Automovil.get(params.automovil)
        def reserva=Reserva.get(params.id)
        def mensaje="Estimado cliente, su reserva fue aceptada. "
        reserva.setHabitacion(habitacion)
        reserva.setEstado("asignado")
        reserva.save()
        habitacion.save()
        if (automovil!=null){
            reserva.reservaAutomovil.setEstado("asignado")
            reserva.reservaAutomovil.save()
            mensaje=mensaje+"El ${automovil.modelo} que solicitó pudo ser reservado."
        }else{
            mensaje=mensaje+"El ${automovil.modelo} que solicitó no pudo ser reservado. "
        }
        mensaje=mensaje+"Gracias por hospedarse en nuestro hotel."
        sendMail {
            to reserva.huesped.email
            subject "Reserva de hotel"
            text mensaje
        }
        render view:"index",model:[reservas:Hotel.getInstance().getReservas()]
    }
}

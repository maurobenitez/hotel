package hotel

class ReservaController {

    def index() {
    	[reservas: Hotel.getInstance().getReservas()]
    }

    def show(){
    	[reserva:Reserva.get(params.id)]
    }

    def asignar(){
    	def reserva=Reserva.get(params.id)
        def habitaciones1=Reserva.findAll{
            ((fecha_inicio>=reserva.fecha_inicio)&&(fecha_inicio<=reserva.fecha_fin)) && estado=="asignado"
        }.habitacion

        def habitaciones=Habitacion.list()
        habitaciones.removeAll(habitaciones1)
        def autosDisponibles=ReservaAutomovil.findAll{
            (fecha_inicio>=reserva.fecha_inicio)&&(fecha_inicio<=reserva.fecha_fin)
        }.size()
    	[habitaciones:habitaciones, reserva:reserva,automovil:reserva.reservaAutomovil.automovil]
    }

    def save(){
        def habitacion=Habitacion.get(params.habitacion)
        def automovil=Automovil.get(params.automovil)
        def reserva=Reserva.get(params.id)
        reserva.setHabitacion(habitacion)
        reserva.setEstado("asignado")
        reserva.save()
        habitacion.save()
        reserva.reservaAutomovil.setEstado("asignado")
        automovil.save()
        reserva.reservaAutomovil.save()
        render view:"index",model:[reservas:Hotel.getInstance().getReservas()]
    }
}

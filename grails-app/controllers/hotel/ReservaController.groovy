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
    	// def habitaciones1=Reserva.findAll{
    	// 	(fecha_inicio>=reserva.fecha_inicio) && (fecha_fin=<reserva.fecha_fin)
    	// }.habitacion.id
    	// def habitaciones2=Habitacion.findAll{
    	// 	!(id in habitaciones1)
    	// }
    	// [habitaciones:habitaciones2]
    	[habitaciones:Habitacion.list(), reserva:reserva]
    }

    def save(){
        def habitacion=Habitacion.get(params.habitacion)
        def reserva=Reserva.get(params.id)
        println "id de la reserva: "+reserva.id
        println "id de la habitacion: "+habitacion.id
        println "numero: "+habitacion.numero
        println "plazas"+habitacion.plazas
        reserva.habitacion=habitacion
        reserva.estado="asignado"
        println "estado de la reserva: "+reserva.estado
        reserva.save(flush:true)
        habitacion.save(flush:true)
        println "estado de la reserva 2: "+reserva.estado
        println "habitación: "+reserva.habitacion.numero
        render "terminado"
    }
}

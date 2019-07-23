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
          def habitaciones=Habitacion.findAll{
            reserva!=null
          }
    	 [habitaciones:habitaciones, reserva:reserva]
    }

    def save(){
        def habitacion=Habitacion.get(params.habitacion)
        def reserva=Reserva.get(params.id)
        reserva.habitacion=habitacion
        reserva.save()
        habitacion.save()
    }
}

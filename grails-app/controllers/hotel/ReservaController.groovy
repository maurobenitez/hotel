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
    	//  def habitaciones1=Reserva.findAll{
    	//  	(fecha_inicio>=reserva.fecha_inicio) && (fecha_fin<=reserva.fecha_fin)
    	//  }.habitacion.id
    	//  def habitaciones2=Habitacion.findAll{
    	//  	!(id in habitaciones1)
    	//  }
        def fecha_inicio=reserva.fecha_inicio
        def resultados=Habitacion.findAll("""
            select habitacion from Habitacion as habitacion
            left join Reservas as union
            where union.fecha_inicio>:fecha_inicio""",[fecha_inicio:fecha_inicio])
    	 [habitaciones:resultados, reserva:reserva]
        
    	//[habitaciones:Habitacion.list(), reserva:reserva]
    }

    def save(){
        def habitacion=Habitacion.get(params.habitacion)
        def reserva=Reserva.get(params.id)
        reserva.habitacion=habitacion
        reserva.save(flush:true)
        habitacion.save(flush:true)
    }
}

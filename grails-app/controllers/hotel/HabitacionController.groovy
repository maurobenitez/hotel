package hotel

class HabitacionController {

    def index() {
      def habitaciones=Hotel.getInstance().getHabitaciones()
      [habitaciones: habitaciones]
  }

  def create(){}

  def show(){
    def h=Habitacion.get(params.id)
    [habitacion:h]
  }

  def edit(){
    def h=Habitacion.get(params.id)
    [habitacion:h]
  }

  def save(Habitacion habitacion){
     if (habitacion.hasErrors()){
      flash.errorHabitacion=true
      render view:"create"
      }else
      {
         def hotel=Hotel.getInstance()
         hotel.addToHabitaciones(habitacion)
         hotel.save()
         render view:"index", model:[habitaciones: hotel.getHabitaciones()]
     }
 }  

 def update(){
    def habitacion=Habitacion.get(params.id)
    habitacion.properties=params
    habitacion.save()
    render view:"index", model:[habitaciones: Hotel.getInstance().getHabitaciones()]
}
 
 def delete(){
    def habitacion=Habitacion.get(params.id)
    habitacion.delete()
    render view:"index", model:[habitaciones:Hotel.getInstance().getHabitaciones()]
 }

 
}

package hotel

class HabitacionController {

  def index() {
    def habitaciones=Hotel.getInstance().getHabitaciones()
    [habitaciones: habitaciones]
  }

  def create(){}

  def show(){
    def habitacion=Habitacion.get(params.id)
    [habitacion:habitacion]
  }

  def edit(){
    def habitacion=Habitacion.get(params.id)
    [habitacion:habitacion]
  }

  def save(Habitacion habitacion){
   if (habitacion.hasErrors()){
    flash.errorHabitacion=true
    render view:"create"
    }else{
      habitacion.save()
      def hotel=Hotel.getInstance()
      hotel.addToHabitaciones(habitacion)
      hotel.save()
      render view:"index", model:[habitaciones: hotel.getHabitaciones()]
    }
  }  

  def update(){
    def hotel=Hotel.getInstance()
    hotel.save()
    def habitacion=Habitacion.get(params.id)
    habitacion.properties=params
    habitacion.save()
    hotel.save()
    render view:"index", model:[habitaciones: Hotel.getInstance().getHabitaciones()]
  }

  def delete(){
    def hotel=Hotel.getInstance()
    hotel.save()
    hotel.removeFromHabitaciones(Habitacion.get(params.id))
    hotel.save()
    render view:"index", model:[habitaciones:hotel.getHabitaciones()]
  }
  
}

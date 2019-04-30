package hotel

class HabitacionController {

    def index() {
      def habitaciones=Hotel.getInstance().habitaciones
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
      }else
      {
         def hotel=Hotel.getInstance()
         hotel.addToHabitaciones(habitacion)
         hotel.save()
         render view:"index", model:[habitaciones: hotel.habitaciones]
     }
 }  

 def update(){
    def habitacion=Habitacion.get(params.id)
    habitacion.properties=params
    habitacion.save()
    render view:"index", model:[habitaciones: Hotel.getInstance().habitaciones]
}
 
 def delete(){
    def habitacion=Habitacion.get(params.id)
    habitacion.delete()
    render view:"index", model:[habitaciones:Hotel.getInstance().habitaciones]
 }

 
}

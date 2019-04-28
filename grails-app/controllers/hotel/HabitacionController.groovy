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
         def h1=Hotel.getInstance()
         h1.addToHabitaciones(habitacion)
         h1.save()
         render view:"index", model:[habitaciones: h1.habitaciones]
     }
 }  

 def update(){
    def habitacion=Habitacion.get(params.id)
    habitacion.properties=params
    habitacion.save()
    def hotel=Hotel.getInstance()
    hotel.save()
    render view:"index", model:[habitaciones: Hotel.getInstance().habitaciones]
}
 
 def delete(){
    def habitacion=Habitacion.get(params.id)
    habitacion.delete()
    render view:"index", model:[habitaciones:Hotel.getInstance().habitaciones]
 }

 
}

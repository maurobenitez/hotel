package hotel

class AutomovilController {

    def index() {
      def automoviles=Automovil.list()
      [automoviles: automoviles]
  }

  def create(){}

  def show(){
    def automovil=Automovil.get(params.id)
    [automovil:automovil]
  }

  def edit(){
    def automovil=Automovil.get(params.id)
    [automovil:automovil]
  }

  def save(Automovil automovil){
     if (automovil.hasErrors()){
      flash.errorAutomovil=true
      render view:"create"
      }else
      {
        automovil.save()
        render view:"index", model:[automoviles: Automovil.list()]
     }
 }  

 def update(){
    def automovil=Automovil.get(params.id)
    automovil.properties=params
    automovil.save()
    render view:"index", model:[automoviles: Automovil.list()]
}
 
 def delete(){
    Automovil.get(params.id).delete()
    render view:"index", model:[automoviles:Automovil.list()]
 }

 
}

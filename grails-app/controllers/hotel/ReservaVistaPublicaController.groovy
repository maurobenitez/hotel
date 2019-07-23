package hotel

class ReservaVistaPublicaController {

    def index() { }

    def create(){
        [automoviles:Automovil.list()]
    }

    def save(Reserva reserva, Huesped huesped){
        if ((reserva.hasErrors())||(params.automovil.getClass().toString()=="class [Ljava.lang.String;")){
            flash.errorReserva=true
            render view:"create", model:[automoviles: Automovil.list()]
        }
        else{
            def automovil=Automovil.get(params.automovil)
            def reservaAutomovil=new ReservaAutomovil(automovil:automovil, fecha_inicio:reserva.fecha_inicio, fecha_fin: reserva.fecha_fin)
            reserva.setHuesped(huesped)
            reserva.setReservaAutomovil(reservaAutomovil)
            reserva.save()
            def hotel=Hotel.getInstance()
            hotel.addToReservas(reserva)
            hotel.addToHuespedes(huesped)
            hotel.save()
        	render view:"show"
        }
        
    }
}

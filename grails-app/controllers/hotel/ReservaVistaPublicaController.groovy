package hotel

class ReservaVistaPublicaController {

    def index() { }

    def create(){
        [automoviles:Automovil.list(),hotel:Hotel.getInstance()]
    }

    def save(Reserva reserva, Huesped huesped){
        if (((reserva.hasErrors())||(params.automovil.getClass().toString()=="class [Ljava.lang.String;"))||(huesped.hasErrors())){
            flash.errorReserva=true
            render view:"create", model:[automoviles: Automovil.list(),hotel:Hotel.getInstance()]
        }
        else{
            def hotel=Hotel.getInstance()
            hotel.save()
            def automovil=Automovil.get(params.automovil)
            if (automovil!=null) automovil.save()
            def reservaAutomovil=new ReservaAutomovil(automovil:automovil, fecha_inicio:reserva.fecha_inicio, fecha_fin: reserva.fecha_fin)
            reservaAutomovil.save()
            reserva.setHuesped(huesped)
            reserva.setReservaAutomovil(reservaAutomovil)
            reserva.save()
            hotel.addToReservas(reserva)
            hotel.addToHuespedes(huesped)
            hotel.save()
        	render view:"show", model:[hotel:Hotel.getInstance()]
        }
        
    }
}

package hotel

class ReservaVistaPublicaController {

    def index() { }

    def create(){
        [automoviles:Automovil.list()]
    }

    def save(Reserva reserva, Huesped huesped){
        
        if (reserva.hasErrors()){
            flash.errorReserva=true
            render view:"create"
        }
        else{
            reserva.setHuesped(huesped)
            reserva.save()
            def hotel=Hotel.getInstance()
            hotel.addToReservas(reserva)
            hotel.addToHuespedes(huesped)
            hotel.save()
            println(reserva.huesped)
            println(huesped.reserva)
        	render view:"show"
        }
        
    }
}

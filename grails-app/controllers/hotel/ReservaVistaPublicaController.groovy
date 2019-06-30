package hotel

class ReservaVistaPublicaController {

    def index() { }

    def create(){
        
    }

    def save(Reserva reserva, Huesped huesped){
        def hotel=Hotel.getInstance()
        hotel.save()
        if (reserva.hasErrors()){
            flash.errorReserva=true
            render view:"create"
        }
        else{
            huesped.setReserva(reserva)
            reserva.save()
            reserva.setHuesped(huesped)
            huesped.save()
            hotel.addToReservas(reserva)
            hotel.addToHuespedes(huesped)
            hotel.save()
            println(reserva.huesped)
            println(huesped.reserva)
        	render view:"show"
        }
        
    }
}

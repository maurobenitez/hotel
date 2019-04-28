package hotel

class ReservaVistaPublicaController {

    def index() { }

    def create(){
        
    }

    def save(Reserva reserva, Huesped huesped){
        def hotel=Hotel.getInstance()
        if (reserva.hasErrors()){
            flash.errorReserva=true
            render view:"create"
        }
        else{
            huesped.setReserva(reserva)
            huesped.save()
            hotel.addToReservas(reserva)
            hotel.addToHuespedes(huesped)
            hotel.save()
        	render view:"show"
        }
        
    }
}

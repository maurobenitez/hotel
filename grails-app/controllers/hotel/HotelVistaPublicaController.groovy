package hotel

class HotelVistaPublicaController {

    def index() {
    	[hotel:Hotel.getInstance()]
    }
}

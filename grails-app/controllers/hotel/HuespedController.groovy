package hotel

class HuespedController {

    def index() {
    	[huespedes: Hotel.getInstance().getHuespedes()]
    }
    def show(){
    	[huesped:Huesped.get(params.id)]
    }
}

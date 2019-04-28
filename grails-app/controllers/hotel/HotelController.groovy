package hotel

class HotelController {

    static defaultAction = "show"

    def show(){
        [hotel:Hotel.getInstance()]
    }

    def edit() {
	   [hotel: Hotel.getInstance()]
    }

    def update(){
	   def hotel=Hotel.getInstance()	
	   hotel.properties=params
	   hotel.save()
       render view:"show", model:[hotel: Hotel.getInstance()]
    }
}

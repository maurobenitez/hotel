package hotel
class Hotel {

    String nombre
    String direccion
    String foto
    String reseña
    private static hotel
    Integer cant_Habitaciones
    static hasMany=[habitaciones:Habitacion, huespedes:Huesped, reservas:Reserva]
    static constraints = {
        nombre nullable:true
        direccion nullable:true
        foto nullable:true
        reseña nullable:true
        cant_Habitaciones nullable:true
    }
    
    static def getInstance(){
        if (hotel==null){
            hotel=new Hotel(nombre:"Las lengas", direccion:"Ushuaia", reseña:"Reseña del hotel", foto:"https://www.ahstatic.com/photos/7205_ho_00_p_2048x1536.jpg")
            hotel.save()
        }
        hotel
    }
    
}

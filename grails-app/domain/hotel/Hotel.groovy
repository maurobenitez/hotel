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
            def habitacion1=new Habitacion(numero:1,plazas:2)
            habitacion1.save()
            def habitacion2=new Habitacion(numero:2,plazas:5)
            habitacion2.save()
            def habitacion3=new Habitacion(numero:3,plazas:9)
            habitacion3.save()
            def habitacion4=new Habitacion(numero:4,plazas:1)
            habitacion4.save() 
            hotel.addToHabitaciones(habitacion1)
            hotel.addToHabitaciones(habitacion2)
            hotel.addToHabitaciones(habitacion3)
            hotel.addToHabitaciones(habitacion4)
            hotel.save()
            def automovil1=new Automovil(modelo: "Toyota Hillux", foto: "https://fotos.perfil.com/2018/12/01/trim/1140/641/1-toyota-hilux-lider-en-ventas-en-noviembre-unidades-patentadas.jpg", cantidad:"4",precio:"700")
            automovil1.save()
            def automovil2=new Automovil(modelo: "Ford Fusion", foto: "https://www.ford.com/cmslibs/content/dam/vdm_ford/live/en_us/ford/nameplate/fusion/2019/collections/billboards/3_2/19_FRD_FSN_43049_PK_bb_desktop.jpg/_jcr_content/renditions/cq5dam.web.1280.1280.jpeg", cantidad:"1",precio:"700")
            automovil2.save()
            def automovil3=new Automovil(modelo: "Volkswagen t-cross", foto: "https://www.diariomotor.com/imagenes/2018/10/volkswagen-t-cross-000.jpg", cantidad:"4",precio:"700")
            automovil3.save()

        }
        hotel
    }
    
}

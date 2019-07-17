package hotel

class Huesped {
    String nombre
    String apellido
    String email
    Integer dni
    String tipo_de_dni
    Reserva reserva

    static belongsTo=[hotel:Hotel,reserva:Reserva]
    static constraints = {
        nombre blank:false
        apellido blank:false
    	email email:true
    	dni min:1, unique:true
        reserva nullable:true
        hotel nullable:true
    }

}

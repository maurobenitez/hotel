package hotel

class Habitacion {

    Integer numero
    Integer plazas
    static belongsTo=[hotel:Hotel]
    static hasMany=[reservas:Reserva]
    static constraints = {
    	numero unique:true
    	plazas min:1
    	hotel nullable:true
    }
}

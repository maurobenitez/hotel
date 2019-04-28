package hotel

class Habitacion {

    Integer numero
    Integer plazas
    static belongsTo=[hotel:Hotel]
    static constraints = {
    	numero unique:true
    	plazas min:1
    }
}

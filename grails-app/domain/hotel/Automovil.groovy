package hotel

class Automovil {
	String modelo
	String foto
	Integer cantidad
	Integer precio
	
    static constraints = {
    	modelo unique:true
    }
}

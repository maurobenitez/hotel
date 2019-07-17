package hotel
import grails.databinding.BindingFormat

class ReservaAutomovil {
	String estado="sin asignar"
    @BindingFormat('dd/MM/yyyy')
    Date fecha_inicio
    @BindingFormat('dd/MM/yyyy')
    Date fecha_fin
    Automovil automovil
    Reserva reserva
    static belongsTo=[reserva:Reserva]

    static constraints = {
        estado nullable:true
        fecha_inicio min:new Date()
        fecha_fin min:new Date()
        automovil nullable:true
        reserva nullable:true
    }
    
}

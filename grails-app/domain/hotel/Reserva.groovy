package hotel
import grails.databinding.BindingFormat
class Reserva {

    String estado="sin asignar"
    @BindingFormat('dd/MM/yyyy')
    Date fecha_inicio
    @BindingFormat('dd/MM/yyyy')
    Date fecha_fin
    Integer cant_huespedes
    Huesped huesped
    ReservaAutomovil reservaAutomovil

    static belongsTo=[hotel:Hotel, habitacion:Habitacion]

    static constraints = {
        estado nullable:true
        fecha_inicio min:new Date()
        fecha_fin min:new Date()
        cant_huespedes min:1
        habitacion nullable:true
        huesped nullable:true, unique:true
        reservaAutomovil nullable:true, unique:true
        hotel nullable:true
    }
    

}

<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="backoffice" />
    <title>Reserva</title>
</head>
<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-4">
                <g:form name="asignarReserva" action="save" id="${reserva.id}">
                <g:select 
                name="habitacion" 
                from="${habitaciones}"
                noSelection="['':'Elija una habitación']"
                optionKey="id"
                optionValue="numero">                        
            </g:select>
            
            <g:if test="${flash.noAutosDisponibles == true}">
                <br>
                No hay autos disponibles
            </g:if>
            <g:else>
            <g:if test="${reserva.reservaAutomovil.automovil != null}">
                <br><g:checkBox name="automovil" value="${automovil.id}"checked="false" />
                Confirmar reserva de ${reserva.reservaAutomovil.automovil.modelo}
            </g:if>
            </g:else>
            <br>
            <g:submitButton name="asignar habitación" value="asignar habitación"/>
            <g:link action="cancelar" id="${reserva.id}">cancelar reserva</g:link>
        </g:form>
        <div class="col-sm-4"></div>
    </div>
</div>
</body>
</html>

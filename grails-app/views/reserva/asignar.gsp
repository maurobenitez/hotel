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
            <g:submitButton name="asignar habitación" value="asignar habitación"/>
            ${reserva.reservaAutomovil.automovil.modelo}
        </g:form>
        <div class="col-sm-4"></div>
    </div>
</div>
</body>
</html>

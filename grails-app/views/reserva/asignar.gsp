<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="backoffice" />
        <title>Reserva</title>
    </head>
    <body>
        <g:form name="asignarReserva" action="save" id="${reserva.id}">
    	   <g:select 
                name="habitacion" 
                from="${habitaciones}"
                noSelection="['':'Elija una habitación']"
                optionKey="id"
                optionValue="numero">                        
            </g:select> 
            <g:submitButton name="asignar habitación" value="asignar habitación"/>
        </g:form>
    </body>
</html>

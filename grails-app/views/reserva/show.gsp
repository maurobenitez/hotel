<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="backoffice" />
        <title>Reserva</title>
    </head>
    <body>
    	<h1>Reserva</h1>
	    <p><b>Desde: </b><g:formatDate format="dd/MM/yy" date="${reserva.fecha_inicio}"/></td></p>
        <p><b>Hasta: </b><g:formatDate format="dd/MM/yy" date="${reserva.fecha_fin}"/></td></p>
	    <p><b>Cantidad de huespedes:</b> ${reserva.cant_huespedes}</p>
	    <p><b>Estado: </b>${reserva.estado}</p>
    </body>
</html>

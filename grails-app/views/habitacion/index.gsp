<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="backoffice" />
        <title>Habitaciones</title>
    </head>
    <body>
        <div class="container-fluid">
    	<h1>Habitaciones</h1>
        <table class="table table-striped">
        	<tr>
        		<th>Numero</th>
        		<th>Plazas</th>
                <th></th>
                <th></th>
        	</tr>
        	<g:each in="${habitaciones}" var="habitacion">
	        	<tr>
	        		<td>${habitacion.numero}</td>
	        		<td>${habitacion.plazas}</td>
                    <td><g:link action="edit" id="${habitacion.id}">editar</g:link></td>
                    <td><g:link action="delete" id="${habitacion.id}">borrar</g:link></td>
	        	</tr>
        	</g:each>
        </table>
        <g:link action="create">Añadir habitación</g:link>
    </div>
    </body>
</html>


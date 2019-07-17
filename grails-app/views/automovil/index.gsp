<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="backoffice" />
        <title>Automoviles</title>
    </head>
    <body>
        <div class="container-fluid">
    	<h1>Automoviles</h1>
        <table class="table table-striped">
        	<tr>
        		<th>Modelo</th>
                <th>cantidad</th>
                <th>Precio</th>
                <th></th>
                <th></th>
        	</tr>
        	<g:each in="${automoviles}" var="automovil">
	        	<tr>
	        		<td>${automovil.modelo}</td>
                    <td>${automovil.cantidad}</td>
                    <td>${automovil.precio}</td>
                    <td><g:link action="edit" id="${automovil.id}">editar</g:link></td>
                    <td><g:link action="delete" id="${automovil.id}">borrar</g:link></td>
	        	</tr>
        	</g:each>
        </table>
        <g:link action="create">Añadir automovil</g:link>
    </div>
    </body>
</html>


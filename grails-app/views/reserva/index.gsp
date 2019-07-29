<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="backoffice" />
    <title>Reservas</title>
</head>
<body>
    <div class="container-fluid">
    	<h1>Reservas</h1>
    	<table class="table table-striped">
    		<tr>
              <th>Desde</th>
              <th>Hasta</th>
              <th>Cantidad de huespedes</th>
              <th>Estado</th>
              <th>Huesped</th>
              <th>Asignar</th>
              <th>Habitacion</th>
              <th>Automovil</th>
              <th></th>
          </tr>
          <g:each in="${reservas}" var="reserva">
          <tr>
             <td><g:formatDate format="dd/MM/yy" date="${reserva.fecha_inicio}"/></td>
             <td><g:formatDate format="dd/MM/yy" date="${reserva.fecha_fin}"/></td>
             <td>${reserva.cant_huespedes}</td>
             <td>${reserva.estado}</td>
             <td><g:link action="show" controller="huesped" id="${reserva.huesped.id}">ver huesped</g:link></td>
             <td><g:link action="asignar" id="${reserva.id}">Asignar</g:link></td>
              
             <td>
            <g:if test="${reserva.habitacion != null}">
                 ${reserva.habitacion.numero}
            </g:if>
            </td>
            <td>
            <g:if test="${reserva.reservaAutomovil.automovil != null}">
                 ${reserva.reservaAutomovil.automovil.modelo}
            </g:if>

           </td>
         </tr>
     </g:each>
 </table>
</div>
</body>
</html>

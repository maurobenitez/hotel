<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="backoffice" />
    <title>Huespedes</title>
</head>
<body>
    <div class="container-fluid">
        <h1>Huespedes</h1>
        <table class="table table-striped">
          <tr>
              <th>Nombre y apellido</th>
              <th>dni</th>
              <th>tipo de dni</th>
              <th>email</th>
              <th>Reserva</th>
          </tr>
          <g:each in="${huespedes}" var="huesped">
          <tr>
             <td>${huesped.id} ${huesped.nombre} ${huesped.apellido}</td>
             <td>${huesped.dni}</td>
             <td>${huesped.tipo_de_dni}</td>
             <td>${huesped.email}</td>
             <td><g:link action="show" controller="reserva" id="${huesped.reserva.id}">ver reserva</g:link></td>
         </tr>
     </g:each>
 </table>
</div>
</body>
</html>

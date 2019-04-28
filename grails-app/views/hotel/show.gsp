<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="backoffice" />
    <title>Datos del hotel</title>
</head>
<body>
    
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-4">
                <g:if test="${flash.errorHabitacion == true}">
                <div class="alert alert-danger alert-dismissible" role="alert">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    Error de carga, intente nuevamente
                </div>
            </g:if>

            <h1>Datos del hotel</h1>
            <p><b>Nombre:</b> ${hotel.nombre}</p>
            <p><b>Dirección: </b>${hotel.direccion}</p>
            <p><b>Reseña: </b>${hotel.reseña}</p>
            <p><b>Foto: </b>${hotel.foto}</p>

            <g:link action="edit" class="btn btn-default">editar</g:link>

        </div>
        <div class="col-sm-4"></div>
    </div>
</div>


</body>
</html>

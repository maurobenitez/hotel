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

            <h1>Datos del Hotel</h1>
            <g:form name="cargarHotel">
            <div class="form-group">
                <label for="nombre">Nombre</label>
                <g:textField name="nombre" value="${hotel.nombre}" class="form-control" id="nombre" placeholder="nombre"/>
            </div>
            <div class="form-group">
                <label for="direccion">Dirección</label>
                <g:textField name="direccion" value="${hotel.direccion}" class="form-control" id="direccion" placeholder="direccion"/>
            </div>
            <div class="form-group">
                <label for="reseña">Reseña</label>
                <g:textField name="reseña" value="${hotel.reseña}" class="form-control" id="reseña" placeholder="reseña"/>
            </div>
            <div class="form-group">
                <label for="foto">Foto</label>
                <g:textField name="foto" value="${hotel.foto}" class="form-control" id="foto" placeholder="foto"/>
            </div>
            <g:actionSubmit value="actualizar" action="update" class="btn btn-default"/>
        </g:form>

    </div>
    <div class="col-sm-4"></div>
</div>
</div>


</body>
</html>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="backoffice" />
    <title>Editar automovil</title>
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

            <h1>Editar automovil</h1>
            <g:form name="cargarHotel" id="${automovil.id}">
            <div class="form-group">
                <label for="modelo">Modelo</label>
                <g:textField name="modelo" value="${automovil.modelo}" class="form-control" id="modelo" placeholder="modelo"/>
            </div>
            <div class="form-group">
                <label for="foto">Foto</label>
                <g:textField name="foto" value="${automovil.foto}"class="form-control" id="foto" placeholder="foto"/>
            </div>
            <div class="form-group">
                <label for="cantidad">Cantidad</label>
                <g:textField name="cantidad" value="${automovil.cantidad}" class="form-control" id="cantidad" placeholder="cantidad"/>
            </div>
            <div class="form-group">
                <label for="precio">Precio</label>
                <g:textField name="precio" value="${automovil.precio}"class="form-control" id="precio" placeholder="precio"/>
            </div>
            <g:actionSubmit value="actualizar" action="update" class="btn btn-default"/>
        </g:form>

    </div>
    <div class="col-sm-4"></div>
</div>
</div>


</body>
</html>
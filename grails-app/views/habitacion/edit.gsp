<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="backoffice" />
    <title>Editar habitación</title>
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

            <h1>Editar habitación</h1>
            <g:form name="cargarHotel" id="${habitacion.id}">
            <div class="form-group">
                <label for="numero">Número</label>
                <g:textField name="numero" value="${habitacion.numero}" class="form-control" id="numero" placeholder="numero"/>
            </div>
            <div class="form-group">
                <label for="plazas">Plazas</label>
                <g:textField name="plazas" value="${habitacion.plazas}" class="form-control" id="plazas" placeholder="plazas"/>
            </div>
            <g:actionSubmit value="actualizar" action="update" class="btn btn-default"/>
        </g:form>

    </div>
    <div class="col-sm-4"></div>
</div>
</div>


</body>
</html>
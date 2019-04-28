<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="backoffice" />
    <title>Añadir habitación</title>
</head>
<body>
    <div class="container-fluid">
        <g:if test="${flash.errorHabitacion == true}">
                    <div class="alert alert-danger alert-dismissible" role="alert">
                        <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        Error de carga, intente nuevamente
                    </div>
                </g:if>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-4">
                
                <h1>Añadir habitación</h1>
                <g:form action="save">
                    <div class="form-group">
                        <label for="numero">Número</label>
                        <g:textField name="numero" class="form-control" id="numero" placeholder="numero"/>
                    </div>
                    <div class="form-group">
                        <label for="plazas">Plazas</label>
                        <g:textField name="plazas" class="form-control" id="plazas" placeholder="plazas"/>
                    </div>
                    <g:actionSubmit class="btn btn-default" value="Añadir" action="save"/>
                </g:form>
            </div>
            <div class="col-sm-4"></div>
        </div>
    </div>
</body>
</html>


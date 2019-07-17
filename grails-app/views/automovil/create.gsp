<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="backoffice" />
    <title>Añadir automovil</title>
</head>
<body>
    <div class="container-fluid">
        <g:if test="${flash.errorAutomovil == true}">
                    <div class="alert alert-danger alert-dismissible" role="alert">
                        <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        Error de carga, intente nuevamente
                    </div>
                </g:if>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-4">
                
                <h1>Añadir automovil</h1>
                <g:form action="save">
                    <div class="form-group">
                        <label for="modelo">Modelo</label>
                        <g:textField name="modelo" class="form-control" id="modelo" placeholder="modelo"/>
                    </div>
                    <div class="form-group">
                        <label for="foto">Foto</label>
                        <g:textField name="foto" class="form-control" id="foto" placeholder="foto"/>
                    </div>
                    <div class="form-group">
                        <label for="cantidad">Cantidad</label>
                        <g:textField name="cantidad" class="form-control" id="cantidad" placeholder="cantidad"/>
                    </div>
                    <div class="form-group">
                        <label for="precio">Precio</label>
                        <g:textField name="precio" class="form-control" id="precio" placeholder="precio"/>
                    </div>
                    <g:actionSubmit class="btn btn-default" value="Añadir" action="save"/>
                </g:form>
            </div>
            <div class="col-sm-4"></div>
        </div>
    </div>
</body>
</html>


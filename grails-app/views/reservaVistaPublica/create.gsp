<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="vistaPublica" />
    <title>Reservar habitacion</title>
</head>
<body>
    <div class="container-fluid">
         <g:if test="${flash.errorReserva == true}">
                <div class="alert alert-danger alert-dismissible" role="alert">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    Error de carga, intente nuevamente
                </div>
            </g:if>
        <div class="row">
            <h1>Introduzca sus datos</h1>
            <div class="col"></div>       
            <g:form action="save">
            <div class="col">
            <div class="form-group">  
                <label for="nombre">Nombre</label>
                <g:textField name="nombre" class="form-control" id="nombre"/>
            </div>
            <div class="form-group">
                <label for="apellido">Apellido</label>
                <g:textField name="apellido" class="form-control" id="apellido"/>
            </div>
            <div class="form-group">
                <label for="dni">DNI</label>
                <g:textField name="dni" class="form-control" id="dni"/>
            </div>
            <div class="form-group">
                <label for="tipo_de_dni">Tipo de DNI</label>
                <g:textField name="tipo_de_dni" class="form-control" id="tipo_de_dni"/>
            </div>
            </div>
            <div class="col">
            <div class="form-group">
                <label for="fecha_inicio">Desde: </label>
                <g:textField name="fecha_inicio" class="form-control" id="fecha_inicio"/>           
                
            </div>
            <div class="form-group">
                <label for="fecha_fin">Hasta: </label>
                <g:textField name="fecha_fin" class="form-control" id="fecha_fin"/>
            </div>
            <div class="form-group">
                <label for="cant_huespedes">Cantidad de huéspedes</label>
                <g:textField name="cant_huespedes" class="form-control" id="cant_huespedes"/>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <g:textField name="email" class="form-control" id="email"/>
            </div>
            <h1>Autos</h1>
            <g:each in="${automoviles}" var="automovil">
                <div class="img-thumbnail">
                    <img src="${automovil.foto}" alt="${automovil.modelo}" style="width:100%">
                    <div class="caption">
                        <g:checkBox name="automovil" value="${automovil.id}"checked="false" />
                        <h5>${automovil.modelo}</h5>
                    </div>
                </div>
            </g:each>
            <br>
            <g:actionSubmit value="Reservar" action="save"/>
        </div>
        </g:form>
    <div class="col"></div>
    <div class="col"></div>
</div>
</div>
</body>
</html>

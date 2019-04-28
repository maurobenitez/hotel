<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="backoffice" />
        <title>Login</title>
    </head>
    <body>

        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-4"></div>
                <div class="col-sm-4">
                    <h1>Iniciar sesión</h1>
                    <g:if test="${flash.error == true}">
            Error de autenticación, intente nuevamente
        </g:if>
        <g:form name="login" action="loguear">
            <div class="form-group">
                <label for="usuario">Usuario</label>
                <g:textField name="usuario" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="password">Contraseña</label>
                <g:passwordField name="password" class="form-control"/>
            </div>
            <g:submitButton class="btn btn-default" name="ingresar" value="ingresar"/>
        </g:form>

                </div>
                <div class="col-sm-4"></div>
            </div>
        </div>
        
    </body>
</html>

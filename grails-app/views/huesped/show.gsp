<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="backoffice" />
    <title>Huesped</title>
</head>
<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-4">
                <h1>Huesped</h1>
                <p><b>Nombre y apellido: </b>${huesped.nombre} ${huesped.apellido}</p>
                <p><b>Número de documento: </b>${huesped.dni}</p>
                <p><b>Tipo de documento: </b>${huesped.tipo_de_dni}</p>
                <p><b>Email: </b>${huesped.email}</p>
                <div class="col-sm-4"></div>
            </div>
        </div>
    </div>
</body>
</html>

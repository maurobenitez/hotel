<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="vistaPublica" />
        <title>Hotel</title>
    </head>
    <body>
    	<div class="jumbotron">
			<img src="${hotel.foto}"class="img-responsive" />
	    	<h1>Bienvenido al hotel ${hotel.nombre}</h1>
	    	${hotel.reseña}
	    </div>
    </body>
</html>

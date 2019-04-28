package hotel


class LoginInterceptor {

	LoginInterceptor(){
        match(controller:'habitacion')
        match(controller:'hotel')
        match(controller:'huesped')
        match(controller:'reserva')
	}
    boolean before() { 
    	if (!session.logueado) 
        redirect(controller:'login')
        else true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}

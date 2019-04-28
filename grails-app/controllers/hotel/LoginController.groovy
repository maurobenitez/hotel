package hotel

class LoginController {

	static defaultAction = "login"

    def login() {}

    def loguear(Login login){
    	if ((login.usuario=="admin") && (login.password=="admin")){
    		session.logueado=true
    		redirect(controller:"hotel", action:"show")
    	}
    	else{
    		flash.error=true
    		redirect(action:"login")
    	}  	
    }

    def desloguear(){
    	session.logueado=false
    	redirect(controller:"hotelVistaPublica",action:"index")
    }
}

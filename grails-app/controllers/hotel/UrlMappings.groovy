package hotel

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/"(controller: "hotelVistaPublica", action: "index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}

package com.co.test.clases.claseserviciosrest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/information")
@Slf4j
public class InformationController {

    /**
    * methodos http -> get, post, put, patch, delete, head, options
    *
    * get -> obtener informacion
    * post -> crear infromacion nueva de un objeto
    * put -> actualizar varios elementos de un objeto
    * patch -> actualizar un elemento de un objeto
    * delete -> eliminar un objeto
    * head -> cabeceras de comunicacion
    * options -> validador de destinos
    *
    * */

    /**
     * Identificador de acceso
     *
     * public -> acceso desde cualquier parte de la aplicacion
     * private -> acceso unicamente desde la clase
     * protected -> acceso unicamente desde el paquete
     * default -> acceso unicamente de paquetes del mismo nivel
     *
     */

    @GetMapping("getInfo")
    public String getInfo(){
        log.info("acceso a operacion getInfo desde servicio rest ");
        return "informacion recuperada ";
    }


    /**
     * retorno de objeto es de tipo JSON -> (JavaScript Object Notation)
     * @param tipo
     * @param docu
     * @return
     */
    @GetMapping("getInfo/{tipo}/{docu}")
    public Respuesta getInfoKey(@PathVariable("tipo") String tipo, @PathVariable("docu") String docu ){
        log.info("acceso a operacion getInfoKey desde servicio rest tipo: " + tipo + " documento: " + docu);
        Respuesta rta = new Respuesta(tipo,docu);
        //return "informacion recuperada con el tipo : " + tipo + " documento: " + docu;
        return rta;
    }


}

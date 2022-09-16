package com.co.test.clases.claseserviciosrest.controller;

import com.co.test.clases.claseserviciosrest.dto.Respuesta;
import com.co.test.clases.claseserviciosrest.entity.Moneda;
import com.co.test.clases.claseserviciosrest.entity.Pais;
import com.co.test.clases.claseserviciosrest.service.MonedaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/information")
@Slf4j
public class InformationController {

    private final MonedaService monedaService;

    @Autowired
    public InformationController(MonedaService monedaService) {
        this.monedaService = monedaService;
    }

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

    @PostMapping("createMoneda")
    @ResponseStatus(HttpStatus.CREATED)
    public String createMoneda(@RequestBody Moneda moneda){
        log.info("ingreso a operacion create moneda");
        return monedaService.createMoneda(moneda);
    }

    @GetMapping("getMoneda/{id}")
    public Moneda getMoneda(@PathVariable("id") int id ){

        return monedaService.findById(id)
                .orElse(new Moneda());
        /**
         * Optional<Moneda> mon =  monedaService.findById(id);
         * if(mon.get() == null){
         *     return new Moneda();
         * } else{
         *     return mon.get();
         * }
         */

        /*return monedaService.findAllMonedas()
                .stream().filter(x -> x.getId() == id)
                .findAny().orElse(new Moneda()); */

        /**
         * codigo de uso secuencial
         *  List<Moneda> mon = monedaService.findAllMonedas();
         *  Moneda monedaReturn = new Moneda();
         *  for(int i = o; i < mon.size(); i++ ){
         *      if(mon.get(i).getId() == id  ){
         *          //return moneda.get(i);
         *          monedaReturn = moneda.get(i);
         *      }
         *  }
         *  return monedaReturn;
         *
         */
    }

    @GetMapping("findAll")
    public List<Moneda> findAllMoneda(){
        return monedaService.findAllMonedas();
    }

    @GetMapping("getPais")
    public Pais getPais(){
        Pais pais = new Pais();
        pais.setId(1);
        pais.setNombrePais("Colombia");
        pais.setCodPais("CO");
        pais.setIdMoneda(1);
        log.info(pais.toString());
        //monedaService.findById(pais.getIdMoneda());
        return pais;
    }

}

package com.co.test.clases.claseserviciosrest.controller;

import com.co.test.clases.claseserviciosrest.entity.MonedaEntity;
import com.co.test.clases.claseserviciosrest.entity.PaisEntity;
import com.co.test.clases.claseserviciosrest.service.MonedaService;
import com.co.test.clases.claseserviciosrest.service.PaisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Transactional
@RestController
@RequestMapping("api/carrera")
@Slf4j
public class CarreraController {

    private final MonedaService monedaService;
    private final PaisService paisService;

    @Autowired
    public CarreraController(MonedaService monedaService, PaisService paisService) {
        this.monedaService = monedaService;
        this.paisService = paisService;
    }

    @PostMapping("createMoneda")
    @ResponseStatus(HttpStatus.CREATED)
    public String createMoneda(@RequestBody MonedaEntity monedaEntity){
        log.info("ingreso a operacion create moneda");
        return monedaService.createMoneda(monedaEntity);
    }

    @GetMapping("getMoneda/{id}")
    public MonedaEntity getMoneda(@PathVariable("id") int id ){

        return monedaService.findById(id)
                .orElse(new MonedaEntity());
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
    public List<MonedaEntity> findAllMoneda(){
        return monedaService.findAllMonedas();
    }

    @GetMapping("getPais/{id}")
    public PaisEntity getPais(@PathVariable("id") int id){
/*        Pais pais = new Pais();
        pais.setId(1);
        pais.setNombrePais("Colombia");
        pais.setCodPais("CO");
        pais.setIdMoneda(1);
        log.info(pais.toString());
        //monedaService.findById(pais.getIdMoneda());
        return pais; */
        return paisService.getPaisById(id).orElse(new PaisEntity());
    }


}

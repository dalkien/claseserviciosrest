package com.co.test.clases.claseserviciosrest.controller;

import com.co.test.clases.claseserviciosrest.entity.InscripcionEntity;
import com.co.test.clases.claseserviciosrest.entity.MonedaEntity;
import com.co.test.clases.claseserviciosrest.entity.PaisEntity;
import com.co.test.clases.claseserviciosrest.entity.ParticipanteEntity;
import com.co.test.clases.claseserviciosrest.service.InscripcionService;
import com.co.test.clases.claseserviciosrest.service.MonedaService;
import com.co.test.clases.claseserviciosrest.service.PaisService;
import com.co.test.clases.claseserviciosrest.service.ParticipanteService;
import com.co.test.clases.claseserviciosrest.utils.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@RestController
@RequestMapping("api/carrera")
@Slf4j
public class CarreraController {

    private final MonedaService monedaService;
    private final PaisService paisService;

    private final InscripcionService inscripcionService;

    private final ParticipanteService participanteService;

    @Autowired
    public CarreraController(MonedaService monedaService, PaisService paisService, InscripcionService inscripcionService, ParticipanteService participanteService) {
        this.monedaService = monedaService;
        this.paisService = paisService;
        this.inscripcionService = inscripcionService;
        this.participanteService = participanteService;
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

    @GetMapping ("Inscripcion/{id}")
  //  public InscripcionEntity getInscripcion(@PathVariable("id")int id){
    public ResponseEntity getInscripcion(@PathVariable("id")int id){
        //String str = null;
        //boolean concat = str.equals("x");
        //return inscripcionService.consultaInscripcion(id).orElse(new InscripcionEntity());
        return inscripcionService.consultaInscripcion(id).map(u -> ResponseEntity.ok(u))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("incripcion/crear")
    public String crearIncripcion (@RequestBody InscripcionEntity variable2){
        return inscripcionService.creacionDatos(variable2);
    }

    @GetMapping("getParticipante/{id}")
    public ParticipanteEntity getParticipante(@PathVariable("id") int id){
        return  participanteService.findByid(id).orElse(new ParticipanteEntity());
    }

    @PostMapping("createParticipante")
    public String createParticipante(@RequestBody ParticipanteEntity participanteEntity){
        return  participanteService.createParticipante(participanteEntity);
    }

    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(NullPointerException.class)
    public Map<String, String> handlerErros(NullPointerException ex){
        Map<String, String> respnseError = new HashMap<>();
        respnseError.put(ErrorResponse.ERROR_DATA.errorname(), ErrorResponse.ERROR_DATA.errorDescrition());
        return respnseError;
    }

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(Exception.class)
    public Map<String, String> handlerErros(Exception ex){
        Map<String, String> respnseError = new HashMap<>();
        respnseError.put(ErrorResponse.NOT_FOUND_DATA.errorname(), ErrorResponse.NOT_FOUND_DATA.errorDescrition());
        return respnseError;
    }
}

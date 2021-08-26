package com.dio.controlepontoapi.controller;

import com.dio.controlepontoapi.Repository.JornadaRepository;
import com.dio.controlepontoapi.Service.JornadaService;
import com.dio.controlepontoapi.model.JornadaTrabalho;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class JornadaTrabalhoController {

    private JornadaService jornadaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public JornadaTrabalho createJornada(@Valid  @RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @GetMapping("{/id}")
    public ResponseEntity<JornadaTrabalho> getJornadaByID(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok( jornadaService.getById(id).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @DeleteMapping("/{jornadaId}")
    public void deleteJornada(@PathVariable Long id){
        jornadaService.deleteJornada(id);
    }


}

package com.dio.controlepontoapi.controller;

import com.dio.controlepontoapi.Repository.JornadaRepository;
import com.dio.controlepontoapi.Service.JornadaService;
import com.dio.controlepontoapi.model.JornadaTrabalho;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jornada")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class JornadaTrabalhoController {

    private JornadaService jornadaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{jornadaId}")
    public void deleteJornada(@PathVariable Long id){
        jornadaService.excluir(id);
    }


}

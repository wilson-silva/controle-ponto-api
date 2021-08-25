package com.dio.controlepontoapi.Service;

import com.dio.controlepontoapi.Repository.JornadaRepository;
import com.dio.controlepontoapi.model.JornadaTrabalho;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class JornadaService {

    private JornadaRepository jornadaRepository;

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public void excluir(Long jornadaId){
        jornadaRepository.deleteById(jornadaId);
    }


}

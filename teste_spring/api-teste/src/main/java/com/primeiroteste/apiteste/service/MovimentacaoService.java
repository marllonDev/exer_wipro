package com.primeiroteste.apiteste.service;

import com.primeiroteste.apiteste.model.Movimentacao;
import com.primeiroteste.apiteste.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    public Movimentacao findById(Integer id){
        Optional <Movimentacao> achou = movimentacaoRepository.findById(id);
        return achou.orElse(null);
    }

    public List<Movimentacao> findAll(){
        return movimentacaoRepository.findAll();
    }

    public Movimentacao create(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public Movimentacao update(Movimentacao movimentacao, Integer id){
        movimentacaoRepository.findById(id);
        return movimentacaoRepository.save(movimentacao);
    }

    public void delete(Integer id){
        if (!movimentacaoRepository.existsById(id)){
            System.err.println("Este ID não existe!");
        }
        movimentacaoRepository.deleteById(id);
    }
}

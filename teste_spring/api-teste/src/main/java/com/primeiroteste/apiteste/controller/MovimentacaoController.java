package com.primeiroteste.apiteste.controller;

import com.primeiroteste.apiteste.model.Movimentacao;
import com.primeiroteste.apiteste.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacao")
@CrossOrigin("*")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoService movimentacaoService;

    @GetMapping
    public ResponseEntity<List<Movimentacao>> obterTodos() {
        return ResponseEntity.ok(movimentacaoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movimentacao> obterPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(movimentacaoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Movimentacao> salvar(@RequestBody Movimentacao movimentacao) {
        return ResponseEntity.status(HttpStatus.CREATED).body(movimentacaoService.create(movimentacao));
    }

    @PutMapping
    public ResponseEntity<Movimentacao> editar(@RequestBody Movimentacao movimentacao){
        return ResponseEntity.ok(movimentacaoService.update(movimentacao, movimentacao.getId()));
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
        movimentacaoService.delete(id);
    }
}

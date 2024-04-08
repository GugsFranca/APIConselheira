package com.spring.apicotacao.controller;

import com.spring.apicotacao.model.Pessoa;
import com.spring.apicotacao.service.AdviceAPI;
import com.spring.apicotacao.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("conselho")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;
    @Autowired
    private AdviceAPI adviceAPI;

    @GetMapping
    public ResponseEntity<Iterable<Pessoa>> buscarTodos() {
        adviceAPI.obterConselho();
        return ResponseEntity.ok(pessoaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(pessoaService.findByID(id));
    }

    @PostMapping
    public ResponseEntity<Pessoa> inserir(@RequestBody Pessoa pessoa) {
        pessoaService.insert(pessoa);
        return ResponseEntity.ok(pessoa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> atualizar(@PathVariable Long id, @RequestBody Pessoa pessoa) {
        pessoaService.update(id, pessoa);
        return ResponseEntity.ok(pessoa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        pessoaService.delete(id);
        return ResponseEntity.ok().build();
    }
}

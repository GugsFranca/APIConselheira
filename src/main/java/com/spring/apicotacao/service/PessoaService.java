package com.spring.apicotacao.service;

import com.spring.apicotacao.model.Pessoa;

import java.util.List;

public interface PessoaService {
    List<Pessoa> findAll();

    Pessoa findByID(Long id);

    void insert(Pessoa Pessoa);

    void update(Long id, Pessoa Pessoa);

    void delete(Long id);
}

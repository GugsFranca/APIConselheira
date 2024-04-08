package com.spring.apicotacao.service;

import com.spring.apicotacao.model.Pessoa;
import com.spring.apicotacao.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImp implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private AdviceAPI adviceAPI;
    @Autowired
    private TranslationService translationService;


    @Override
    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    @Override
    public Pessoa findByID(Long id) {
        // Buscar loja por ID.
        Optional<Pessoa> loja = pessoaRepository.findById(id);
        return loja.get();
    }

    @Override
    public void insert(Pessoa pessoa) {
        String text = adviceAPI.obterConselho();
        pessoa.setAdvice(text);
        translationService.translateText(text, "pt");
        pessoaRepository.save(pessoa);
    }

    @Override
    public void update(Long id, Pessoa pessoa) {
       pessoaRepository.findById(id).ifPresent(salvar -> pessoaRepository.save(pessoa));
    }

    @Override
    public void delete(Long id) {
        pessoaRepository.deleteById(id);
    }

}

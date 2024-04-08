package com.spring.apicotacao.repository;

import com.spring.apicotacao.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Long > {

}

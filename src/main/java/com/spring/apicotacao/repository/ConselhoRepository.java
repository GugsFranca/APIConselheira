package com.spring.apicotacao.repository;

import com.spring.apicotacao.model.Conselho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConselhoRepository extends JpaRepository<Conselho,Integer > {
}

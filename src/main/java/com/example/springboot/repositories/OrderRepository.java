package com.example.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.projeto.entities.Ordenacao;


@RepositoryRestResource(collectionResourceRel = "ordenacao", path = "ordenacao")
public interface OrderRepository extends JpaRepository<Ordenacao, Integer> {

}

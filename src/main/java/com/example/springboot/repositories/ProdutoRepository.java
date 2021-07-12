package com.example.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.projeto.entities.Produto;


@RepositoryRestResource(collectionResourceRel = "produto", path = "produto")
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}

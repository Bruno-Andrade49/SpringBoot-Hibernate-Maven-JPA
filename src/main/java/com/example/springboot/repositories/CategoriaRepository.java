package com.example.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.projeto.entities.Categoria;


@RepositoryRestResource(collectionResourceRel = "categoria", path = "categoria")
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}

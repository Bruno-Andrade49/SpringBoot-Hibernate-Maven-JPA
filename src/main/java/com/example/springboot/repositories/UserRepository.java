package com.example.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.projeto.entities.Usuario;


@RepositoryRestResource(collectionResourceRel = "usuario", path = "usuario")
public interface UserRepository extends JpaRepository<Usuario, Integer>{

}

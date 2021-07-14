package com.example.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.projeto.entities.Payment;


@RepositoryRestResource(collectionResourceRel = "pagamento", path = "pagamento")
public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}

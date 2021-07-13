package com.example.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.projeto.entities.OrderItem;
import com.example.projeto.entities.pk.OrdenacaoItemPK;

@RepositoryRestResource(collectionResourceRel = "orderItem", path = "orderItem")
public interface OrderItemRepository extends JpaRepository<OrderItem, OrdenacaoItemPK> {

}

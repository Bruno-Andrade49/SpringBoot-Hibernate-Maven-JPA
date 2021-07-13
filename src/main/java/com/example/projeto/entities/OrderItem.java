package com.example.projeto.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

import com.example.projeto.entities.pk.OrdenacaoItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity@Repository @Table(name = "tb_order_item")
public class OrderItem  implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrdenacaoItemPK id;
	
	private Integer quantidade;
	private Double  price;
	public OrderItem(Ordenacao ordenacao, Produto produto, Integer quantidade, Double price) {
		
		id.setOrdenacao(ordenacao);
		id.setProduto(produto);
		this.quantidade = quantidade;
		this.price = price;
	}
	
	public OrderItem() {
		
	}
	
	@JsonIgnore
	public Ordenacao getOrdenacao() {
		return  id.getOrdenacao();
	}
	
	public void setOrdenacao(Ordenacao ordenacao) {
		id.setOrdenacao(ordenacao);
	}
	
	public Produto getProduto() {
		return  id.getProduto();
	}
	
	public void setProduto(Produto produto) {
		id.setProduto(produto);
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		return true;
	}
	
	
}

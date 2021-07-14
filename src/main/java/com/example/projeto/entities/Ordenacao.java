package com.example.projeto.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonFormat;

@Repository
@Entity
public class Ordenacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant moment;
	
	private Integer OrderStatus;

	@OneToOne(mappedBy = "ordenacaoPag", cascade = CascadeType.ALL)
	private Payment payment;
	
	public Integer getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		OrderStatus = orderStatus;
	}

	public Ordenacao(Integer id, Instant moment, Integer orderStatus, Usuario userClient) {
		this.id = id;
		this.moment = moment;
		this.OrderStatus = orderStatus;
		this.userClient = userClient;
	}

	@ManyToOne
	@JoinColumn(name = "Client_ID")
	private Usuario userClient;
	
	@OneToMany(mappedBy = "id.ordenacao")
	private Set<OrderItem> itens = new HashSet<>();

	public Ordenacao() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public Usuario getClient() {
		return userClient;
	}

	public void setClient(Usuario client) {
		this.userClient = client;
	}
	
	public Set<OrderItem> getitens() {
		return itens;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((OrderStatus == null) ? 0 : OrderStatus.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((moment == null) ? 0 : moment.hashCode());
		result = prime * result + ((userClient == null) ? 0 : userClient.hashCode());
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
		Ordenacao other = (Ordenacao) obj;
		if (OrderStatus == null) {
			if (other.OrderStatus != null)
				return false;
		} else if (!OrderStatus.equals(other.OrderStatus))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (moment == null) {
			if (other.moment != null)
				return false;
		} else if (!moment.equals(other.moment))
			return false;
		if (userClient == null) {
			if (other.userClient != null)
				return false;
		} else if (!userClient.equals(other.userClient))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", client=" + userClient
				+ "]";
	}

}

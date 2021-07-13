package com.example.projeto.entities.pk;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.projeto.entities.Ordenacao;
import com.example.projeto.entities.Produto;

public class OrdenacaoItemPK implements Serializable{

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "Produto_ID")
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name = "Ordenação_ID")
	private Ordenacao ordenacao;
	
	public OrdenacaoItemPK() {
		
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Ordenacao getOrdenacao() {
		return ordenacao;
	}

	public void setOrdenacao(Ordenacao ordenacao) {
		this.ordenacao = ordenacao;
	}

	public OrdenacaoItemPK(Produto produto, Ordenacao ordenacao) {
		this.produto = produto;
		this.ordenacao = ordenacao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ordenacao == null) ? 0 : ordenacao.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
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
		OrdenacaoItemPK other = (OrdenacaoItemPK) obj;
		if (ordenacao == null) {
			if (other.ordenacao != null)
				return false;
		} else if (!ordenacao.equals(other.ordenacao))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		return true;
	}


}

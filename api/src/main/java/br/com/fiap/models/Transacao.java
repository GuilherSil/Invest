package br.com.fiap.models;

import java.sql.Date;

public class Transacao {
	private Long id;
	private boolean compraVenda;
	private String corretora;
	private Date dataTransacao;
	private String categoria;
	private float valor;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isCompraVenda() {
		return compraVenda;
	}
	public void setCompraVenda(boolean compraVenda) {
		this.compraVenda = compraVenda;
	}
	public String getCorretora() {
		return corretora;
	}
	public void setCorretora(String corretora) {
		this.corretora = corretora;
	}
	public Date getDataTransacao() {
		return dataTransacao;
	}
	public void setDataTransacao(Date dataTransacao) {
		this.dataTransacao = dataTransacao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	   
	  
}

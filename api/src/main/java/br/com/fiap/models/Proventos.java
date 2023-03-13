package br.com.fiap.models;

import java.util.Date;

public class Proventos {
	private String categoria;
	private String corretora;
	private Date dataTransacao;
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
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
}

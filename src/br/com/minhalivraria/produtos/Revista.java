package br.com.minhalivraria.produtos;

import br.com.minhalivraria.Editora;

public class Revista {
	
	private String nome;
	private String descricoa;
	private double valor;
	private Editora editora;
	
	public Revista(Editora editora) {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricoa() {
		return descricoa;
	}

	public void setDescricoa(String descricoa) {
		this.descricoa = descricoa;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	public boolean aplicarDescontoDe(double porcentagem) {
		if(porcentagem > 0.10) {
			return false;
		}
		double desconto = (this.getValor() * porcentagem);
		setValor(this.getValor() - desconto);
		return true;
	}
	
	public int compare(Produto outro) {
		return Double.compare(this.getValor(), outro.getValor());
	}
	

}

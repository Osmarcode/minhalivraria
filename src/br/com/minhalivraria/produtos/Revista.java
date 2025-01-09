package br.com.minhalivraria.produtos;

import br.com.minhalivraria.Editora;

public class Revista implements Produto, Promocional{
	
	private String nome;
	private String descricao;
	private double valor;
	private String editora;
	
	public Revista(Editora editora) {
		this.editora = editora.getNomeFantasia();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: ").append(nome).append("\n");
		sb.append("Descrição: ").append(descricao).append("\n");
		sb.append("Valor: ").append(valor).append("\n");
		sb.append("Editora: ").append(editora).append("\n");
		return sb.toString();
	}

	@Override
	public int compareTo(Produto outro) {

		return Double.compare(getValor(), outro.getValor());
	}
	
	
}

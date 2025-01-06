package br.com.minhalivraria.produtos;

import java.util.Objects;

import br.com.minhalivraria.Autor;
import br.com.minhalivraria.exception.AutorNuloException;

public abstract class Livro  implements Produto{
	
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public Livro(Autor autor) {

		if(autor == null) {
			throw new AutorNuloException("O Autor não pode ser nulo.");
		} 
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}

	public Livro(String nome, String descricao, double valor, String isbn) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.isbn = "000-00-00000-00-0";
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, descricao, isbn, nome, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(isbn, other.isbn) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	@Override
	public String toString() {
		 StringBuilder sb = new StringBuilder();
		    sb.append("Autor: ").append(autor != null ? autor.getNomeAutor() : "Não possui autor.").append("\n");
		    sb.append("Nome: ").append(nome).append("\n");
		    sb.append("Descrição: ").append(descricao).append("\n");
		    sb.append("Valor R$: ").append(valor).append("\n");
		    sb.append("ISBN: ").append(isbn).append("\n");
		    return sb.toString();
	}
	
	public double compare(Livro outro) {
		return Double.compare(this.getValor(), outro.getValor());
	}

}

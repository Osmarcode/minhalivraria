package br.com.minhalivraria.produtos;

import br.com.minhalivraria.Autor;

public class MiniLivro extends Livro{
	
	public MiniLivro(Autor autor) {
		super(autor);
	}
	
	@Override
	public int compareTo(Produto outro) {
		if(this.getValor() > outro.getValor()) {
			return -1;
		} 
		if(this.getValor() < outro.getValor()) {
			return 1;
		}
		return 0;
	}
	

}

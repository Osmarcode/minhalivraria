package br.com.minhalivraria.produtos;

import br.com.minhalivraria.Autor;

public class LivroFisico extends Livro implements Promocional{
	
	
	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double taxaDeImpressao() {
		return this.getValor() * 0.05;
	}
	

	public boolean aplicarDescontoDe(double porcentagem) {
		if(getValor() > 0.3) {
			return false;
		} else {
			double desconto = getValor() * porcentagem;
			setValor(getValor() - desconto);
			return true;
		}
	}
	
	@Override
	public int compareTo(Produto outro) {
		return Double.compare(this.getValor(), outro.getValor());
	}
	
	public String toString() {
		return super.toString();
	}

}

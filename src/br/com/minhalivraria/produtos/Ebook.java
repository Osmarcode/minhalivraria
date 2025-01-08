package br.com.minhalivraria.produtos;

import br.com.minhalivraria.Autor;

public class Ebook extends Livro implements Promocional{
	
	private double valor;
	private String watermark;
	
	
	public Ebook(Autor autor) {
		super(autor);
	}

	public String getWatermark() {
		return watermark;
	}

	public void setWatermark(String watermark) {
		this.watermark = watermark;
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

	@Override
	public boolean aplicarDescontoDe(double porcentagem) {
		if(porcentagem > 0.15) {
			return false;
		}
		double desconto = (this.getValor() * porcentagem);
		setValor(this.getValor() - desconto);
		return true;
	}
	
}

package br.com.minhalivraria.produtos;

import br.com.minhalivraria.Autor;

public class Ebook extends Livro implements Promocional{
	
	private double valor;
	private String watermark;
	
	
	public Ebook(Autor autor) {
		super(autor); //super(classe livro) que possui uma exception
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getWatermark() {
		return watermark;
	}

	public void setWatermark(String watermark) {
		this.watermark = watermark;
	}
	
	

}

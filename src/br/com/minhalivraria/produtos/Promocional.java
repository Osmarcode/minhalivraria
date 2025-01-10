package br.com.minhalivraria.produtos;

public interface Promocional {

	boolean aplicarDescontoDe(double porcentagem);

	default boolean aplicarDescontoDe10Porcento() {
		return aplicarDescontoDe(0.10);
	}

}

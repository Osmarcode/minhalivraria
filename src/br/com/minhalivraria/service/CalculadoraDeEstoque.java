package br.com.minhalivraria.service;

import java.math.BigDecimal;

public class CalculadoraDeEstoque {

	public static void main(String[] args) {

		// BigDecimal é uma classe muito indicada para valores precisos e monetários
		BigDecimal soma = BigDecimal.ZERO; // seria o mesmo que inicializar um acumulador com 0.0
		BigDecimal valorUnitario = new BigDecimal("59.90");

		for (int i = 0; i < 30; i++) {
			soma = soma.add(valorUnitario);
		}

		System.out.println(soma);

		if (soma.compareTo(new BigDecimal("150")) < 0) {
			System.out.println("Atenção, estoque muito baixo." + soma);
		} else if (soma.compareTo(new BigDecimal("2000")) >= 0) {
			System.out.println("Atenção, estoque muito alto.");
		} else {
			System.out.println("Estoque OK.");
		}

	}

}

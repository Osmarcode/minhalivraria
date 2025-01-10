package br.com.minhalivraria.service;

import java.util.ArrayList;

import br.com.minhalivraria.produtos.Produto;
import br.com.minhalivraria.produtos.Promocional;

public class CarrinhoDeCompras implements Promocional {

	private double total;
	private ArrayList<Produto> produtos;

	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<Produto>();
		this.total = 0.0;
	}

	public void adiciona(Produto produto) {
		this.produtos.add(produto);
		atualizarTotal();
	}

	public void remover(int posicao) {
		this.produtos.remove(posicao);
		atualizarTotal();
	}

	private void atualizarTotal() {
		total = 0.0;
		for (Produto produto : produtos) {
			total += produto.getValor();
		}

	}

	public double getTotal() {
		return total;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	@Override
	public boolean aplicarDescontoDe(double porcentagem) {
		if (porcentagem > 0 && porcentagem <= 1) {
			total = total - (total * porcentagem);
			return true;
		}
		return false;
	}

}

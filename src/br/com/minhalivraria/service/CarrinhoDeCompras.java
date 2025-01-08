package br.com.minhalivraria.service;

import java.util.ArrayList;

import br.com.minhalivraria.produtos.Produto;


public class CarrinhoDeCompras {

			
		 private double total;
		 private ArrayList<Produto> produtos;
		 
		 public CarrinhoDeCompras() {
			 this.produtos = new ArrayList<Produto>();
		 }
		 
		
		 public void adiciona(Produto produto) {
			 this.produtos.add(produto);
		 }
		 
	
		 public void remover(int posicao) {
			 this.produtos.remove(posicao);
		 }
		 
		 public double getTotal() {
			return total;
		}
		 
		
		public ArrayList<Produto> getProdutos(){
			return produtos;
		}
		

	}


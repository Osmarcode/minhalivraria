package br.com.minhalivraria.service;

import br.com.minhalivraria.Autor;
import br.com.minhalivraria.produtos.Ebook;
import br.com.minhalivraria.produtos.Livro;
import br.com.minhalivraria.produtos.LivroFisico;
import br.com.minhalivraria.produtos.MiniLivro;

public class RegistroDeVendas {

	public static void main(String[] args) {


		Autor autor = new Autor();
		autor.setNomeAutor("Alvares Cabral");
		
		LivroFisico livroFisico = new LivroFisico(autor);
		livroFisico.setNome("Test-Driven Development");
		livroFisico.setDescricao("Desvendando o pattern TDD");
		livroFisico.setValor(59.90);
		livroFisico.setIsbn("456456.9877.55214-741");
		
		System.out.println(livroFisico);
		
		Autor outroAutor = new Autor();
		outroAutor.setNomeAutor("Uncle Bob");
		
		Ebook ebook = new Ebook(outroAutor);
		ebook.setNome("Clean Code");
		ebook.setDescricao("Construindo código limpo");
		ebook.setValor(35.95);
		ebook.setIsbn("144456.9877.55214-741");
		
		System.out.println(ebook);
		
		Autor outroAutor2 = new Autor();
		outroAutor2.setNomeAutor("Jack Sparrow");
		
		MiniLivro miniLivro = new MiniLivro(outroAutor2);
		miniLivro.setNome("Angular");
		miniLivro.setDescricao("Framework Angular");
		miniLivro.setValor(40.95);
		miniLivro.setIsbn("22156.9877.55214-741");
		
		System.out.println(miniLivro);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(ebook);
		carrinho.adiciona(livroFisico);
		carrinho.adiciona(miniLivro);
		
		
		//funciona apenas Classe específica MiniLivro miniLivro e não Livro miniLivro
		if(livroFisico.aplicarDescontoDe10Porcento()) {
			System.out.println("Valor agora é: " + livroFisico.getValor());
		}
		
		

	}

}

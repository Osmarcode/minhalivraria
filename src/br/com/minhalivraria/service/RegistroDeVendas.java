package br.com.minhalivraria.service;

import java.util.List;

import br.com.minhalivraria.Autor;
import br.com.minhalivraria.Editora;
import br.com.minhalivraria.produtos.Ebook;
import br.com.minhalivraria.produtos.LivroFisico;
import br.com.minhalivraria.produtos.MiniLivro;
import br.com.minhalivraria.produtos.Produto;
import br.com.minhalivraria.produtos.Revista;

public class RegistroDeVendas {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNomeAutor("Alvares Cabral");

		LivroFisico livroFisico = new LivroFisico(autor);
		livroFisico.setNome("Test-Driven Development");
		livroFisico.setDescricao("Desvendando o pattern TDD");
		livroFisico.setValor(59.90);
		livroFisico.setIsbn("456456.9877.55214-741");

		Autor outroAutor = new Autor();
		outroAutor.setNomeAutor("Uncle Bob");

		Ebook ebook = new Ebook(outroAutor);
		ebook.setNome("Clean Code");
		ebook.setDescricao("Construindo código limpo");
		ebook.setValor(35.95);
		ebook.setIsbn("144456.9877.55214-741");

		Autor outroAutor2 = new Autor();
		outroAutor2.setNomeAutor("Jack Sparrow");

		MiniLivro miniLivro = new MiniLivro(outroAutor2);
		miniLivro.setNome("Angular");
		miniLivro.setDescricao("Framework Angular");
		miniLivro.setValor(40.95);
		miniLivro.setIsbn("22156.9877.55214-741");

		Editora editora = new Editora();
		editora.setNomeFantasia("Editora Programar");

		Revista revista = new Revista(editora);

		revista.setNome("Revista Novidades do Java");
		revista.setDescricao("Periódico sobre Java publicado mensalmente");
		revista.setValor(35.90);

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		carrinho.adiciona(livroFisico);
		carrinho.adiciona(ebook);
		carrinho.adiciona(miniLivro);
		carrinho.adiciona(revista);

		// excluindo ebook que está na posição 1
		carrinho.remover(1);

		List<Produto> produtos = carrinho.getProdutos();

		for (Produto produto : produtos) {
			System.out.println(produto);
		}

		String formatado = String.format("%.2f", carrinho.getTotal());
		System.out.println("Valor total: R$" + formatado);

	}

}

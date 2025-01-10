package br.com.minhalivraria.service;

import java.util.ArrayList;

import br.com.minhalivraria.Autor;
import br.com.minhalivraria.produtos.Ebook;
import br.com.minhalivraria.produtos.Livro;
import br.com.minhalivraria.produtos.LivroFisico;
import br.com.minhalivraria.produtos.MiniLivro;
import br.com.minhalivraria.produtos.Produto;

public class CadastroDeLivros {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNomeAutor("Rodrigues Silva");

		Livro livroFisico = new LivroFisico(autor);
		livroFisico.setDescricao("Programando com Java 8");
		livroFisico.setIsbn("123.4567.441-777");
		livroFisico.setNome("JAVA 8");
		livroFisico.setValor(59.90);

		Autor outroAutor = new Autor();
		outroAutor.setNomeAutor("Vladmir Express");

		Livro ebook = new Ebook(outroAutor);
		ebook.setNome("Java com Spring");
		ebook.setDescricao("Dominando o Framework Spring para Java");
		ebook.setIsbn("51514.9874.557-8877");
		ebook.setValor(59.90);

		Autor outroAutor2 = new Autor();
		outroAutor2.setNomeAutor("Thiago Leite e Carvalho");

		MiniLivro miniLivro = new MiniLivro(outroAutor2);
		miniLivro.setNome("Estrutura de Dados");
		miniLivro.setDescricao("Domine as práticas essencias em C, Java e C#");
		miniLivro.setIsbn("978-85-5519-338-5");
		miniLivro.setValor(69.90);

		ArrayList<Produto> produtos = new ArrayList<>();

		produtos.add(miniLivro);
		produtos.add(ebook);
		produtos.add(livroFisico);

		System.out.println(produtos);

	}

}

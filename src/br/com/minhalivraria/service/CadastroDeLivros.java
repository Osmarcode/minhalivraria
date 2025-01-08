package br.com.minhalivraria.service;

import br.com.minhalivraria.Autor;
import br.com.minhalivraria.produtos.Ebook;
import br.com.minhalivraria.produtos.Livro;
import br.com.minhalivraria.produtos.LivroFisico;

public class CadastroDeLivros {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNomeAutor("Rodrigues Silva");
		
		Livro livroFisico = new LivroFisico(autor);
		livroFisico.setDescricao("Programando com Java 8");
		livroFisico.setIsbn("123.4567.441-777");
		livroFisico.setNome("JAVA 8");
		livroFisico.setValor(59.90);
		
		System.out.println(livroFisico);
		
		Autor outroAutor = new Autor();
		outroAutor.setNomeAutor("Vladmir Express");
		
		Livro ebook = new Ebook(outroAutor);
		ebook.setDescricao("Dominando o Framework Spring para Java");
		ebook.setIsbn("51514.9874.557-8877");
		ebook.setNome("Java com Spring");
		ebook.setValor(59.90);
		
		System.out.println(ebook);

	}

}

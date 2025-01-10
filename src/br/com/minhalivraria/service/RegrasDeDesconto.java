package br.com.minhalivraria.service;

import br.com.minhalivraria.Autor;
import br.com.minhalivraria.produtos.Ebook;
import br.com.minhalivraria.produtos.LivroFisico;

public class RegrasDeDesconto {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNomeAutor("Paul J. Deitel");

		LivroFisico livroFisico = new LivroFisico(autor);
		livroFisico.setNome("Java como programar");
		livroFisico.setDescricao("Introdução sobre programação com Java");
		livroFisico.setValor(115.95);
		livroFisico.setIsbn("1111.55547.887-110");

		System.out.println(livroFisico);

		if (!livroFisico.aplicarDescontoDe(0.3)) {
			System.out.println("Desconto de 30% não pode ser aplicado.");
		} else {
			String valorFormatado = String.format("%.2f", livroFisico.getValor());
			System.out.println("Novo valor do livro "+ livroFisico.getNome() + " com desconto de 30%: R$" + valorFormatado + "\n");
		}

		Autor outroAutor = new Autor();
		outroAutor.setNomeAutor("Bert Bates");

		Ebook ebook = new Ebook(outroAutor);
		ebook.setNome("Use a cabeça");
		ebook.setDescricao("Guia do aprendiz para programação");
		ebook.setValor(39.95);
		ebook.setIsbn("978-8550819884");

		System.out.println(ebook);

		if (!ebook.aplicarDescontoDe(0.15)) {
			System.out.println("Desconto não pode ser maior que 15%");
		} else {
			String valorFormatado = String.format("%.2f", ebook.getValor());
			System.out.println("Valor do Ebook " + ebook.getNome() + " com desconto de 15% R$" + valorFormatado);
		}

	}

}

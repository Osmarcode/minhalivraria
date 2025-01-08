package br.com.minhalivraria;

import java.util.Objects;

public class Autor {

	private String nomeAutor;
	private String cpfAutor;
	private String emailAutor;

	public void mostrarDetalhesDoAutor() {
		String message2 = "Detalhes do Autor:";
		System.out.println(message2);
		System.out.println("Nome: " + this.nomeAutor);
		System.out.println("CPF: " + this.cpfAutor);
		System.out.println("E-mail: " + this.emailAutor);
		System.out.println("----------------------");
	}


	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getCpfAutor() {
		return cpfAutor;
	}

	public void setCpfAutor(String cpfAutor) {
		this.cpfAutor = cpfAutor;
	}

	public String getEmailAutor() {
		return emailAutor;
	}

	public void setEmailAutor(String emailAutor) {
		this.emailAutor = emailAutor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpfAutor, emailAutor, nomeAutor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(cpfAutor, other.cpfAutor) && Objects.equals(emailAutor, other.emailAutor)
				&& Objects.equals(nomeAutor, other.nomeAutor);
	}

	@Override
	public String toString() {
		return "Autor [nomeAutor=" + nomeAutor + ", cpfAutor=" + cpfAutor + ", emailAutor=" + emailAutor + "]";
	}

}

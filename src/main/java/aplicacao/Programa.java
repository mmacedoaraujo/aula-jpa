package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa(1, "Carlos da Silva", "carlos@gmail.com");
		Pessoa pessoa2 = new Pessoa(2, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa pessoa3 = new Pessoa(3, "Ana Maria", "ana@gmail.com");
		System.out.println(pessoa);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
	}

}

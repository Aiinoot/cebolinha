package br.com.triersistemas.cebolinha;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public abstract class Pessoa {
	private String nome;

	public Pessoa() {
		List<String> nomes = new ArrayList<>();
		nomes.add("Carlos");
		nomes.add("Mariana");
		nomes.add("Lorenzo");
		nomes.add("Pedro");
		nomes.add("Elon Musk");
		nomes.add("Nina");
		nomes.add("Davi");
		nomes.add("Júnior");
		nomes.add("Gustavo");

		SplittableRandom r = new SplittableRandom();
		this.nome = nomes.get(r.nextInt(0, nomes.size()));

	}

	public String getNome() {
		return nome;
	}

}

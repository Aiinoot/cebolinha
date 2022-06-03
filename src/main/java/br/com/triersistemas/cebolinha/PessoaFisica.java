package br.com.triersistemas.cebolinha;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class PessoaFisica extends Pessoa {
	private String cpf = "";

	public String getCpf() {
		List<Integer> numeros = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			SplittableRandom r = new SplittableRandom();
			numeros.add(r.nextInt(0, 10));
		}
		numeros.forEach(t -> cpf += t);
		return this.cpf;
	}

}

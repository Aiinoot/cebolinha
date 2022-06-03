package br.com.triersistemas.cebolinha;

import java.util.SplittableRandom;

public class App {

    public static void main(String[] args) {
    	
        Farmaceutico farmaceutico = new Farmaceutico();
        System.out.println("Farmaceutico: \t"+farmaceutico.getNome() +"\t| Documento: \t"+ farmaceutico.getCpf()+"\t| Oferta do dia: \t"+ farmaceutico.getofertaDia());
        
       Fornecedor fornecedor = new Fornecedor();
       System.out.println("Fornecedor: \t"+fornecedor.getNome() + "\t| Documento: \t"+fornecedor.getCnpj()+"\t| Produtos: \t"+ fornecedor.getProduto());
    }

	private static void calculaCpf(String string) {
		System.out.println(string);
		
	}
}

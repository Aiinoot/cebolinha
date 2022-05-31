package br.com.triersistemas.cebolinha;

import java.util.SplittableRandom;

public class App {

    public static void main(String[] args) {

        Farmaceutico f = new Farmaceutico();
        System.out.println("Farmaceutico: \t"+f.getNome() +"\t| Documento: \t"+ f.getDocumento() +"\t| Oferta do dia: \t"+ f.getofertaDia());
        
       Fornecedor fornecedor = new Fornecedor();
       System.out.println("Fornecedor: \t"+fornecedor.getNome() + "\t| Documento: \t"+fornecedor.getDocumento()+"\t| Produtos: \t"+ fornecedor.getProduto());
    }
}

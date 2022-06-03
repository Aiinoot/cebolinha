package br.com.triersistemas.cebolinha;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor extends PessoaJuridica{
    private List<String> produto;
    
    public List<String> getProduto(){
        return produto;
    }

    public Fornecedor(){

        produto = new ArrayList<>();
        produto.add("Nelsaldina");
        produto.add("Ibupril");
        produto.add("Dorflex");
        produto.add("Paracetamol");
        produto.add("Vermequitina");
        produto.add("Sorine");
        produto.add("Colirio");
        produto.add("Bandeide");
        produto.add("Pasta");  
    }
}

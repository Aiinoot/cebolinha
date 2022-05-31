package br.com.triersistemas.cebolinha;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Farmaceutico extends PessoaFisica{
    private String ofertaDia;

    public String getofertaDia(){
        return ofertaDia;
    }
    public Farmaceutico(){
        List<String> ofertas = new ArrayList<>();
        ofertas.add("Nelsaldina");
        ofertas.add("Ibupril");
        ofertas.add("Dorflex");
        ofertas.add("Paracetamol");
        ofertas.add("Vermequitina");
        ofertas.add("Sorine");
        ofertas.add("Colirio");
        ofertas.add("Bandeide");
        ofertas.add("Pasta");

        SplittableRandom r = new SplittableRandom();
        this.ofertaDia = ofertas.get(r.nextInt(0, ofertas.size()-1));
    }

}

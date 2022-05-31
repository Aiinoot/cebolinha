package br;

import br.com.triersistemas.cebolinha.Pessoa;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public String getDocumento() {
        return this.cnpj;
    }
}

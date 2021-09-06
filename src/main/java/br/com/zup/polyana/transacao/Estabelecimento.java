package br.com.zup.polyana.transacao;

public class Estabelecimento {

    private String nome;
    private String cidade;
    private String endereco;

    @Deprecated
    public Estabelecimento() {

    }

    public String getNome() {
        return nome;
    }
}

package br.com.zup.polyana.transacao;

public class Estabelecimento {

    private String nome;
    private String cidade;
    private String endereco;

    @Override
    public String toString() {
        return "Estabelecimento{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
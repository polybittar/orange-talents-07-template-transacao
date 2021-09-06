package br.com.zup.polyana.transacao;

import javax.persistence.*;

@Entity
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    private Long id;
    private String nome;
    private String cidade;
    private String endereco;

    @Deprecated
    public Estabelecimento() {

    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }
}

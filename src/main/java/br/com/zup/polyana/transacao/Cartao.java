package br.com.zup.polyana.transacao;

public class Cartao {

    private String id;
    private String email;


    @Override
    public String toString() {
        return "Cartao{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
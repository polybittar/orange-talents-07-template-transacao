package br.com.zup.polyana.transacao;


import java.math.BigDecimal;
import java.time.LocalDateTime;

//mensagem, valor
public class MensagemTransacao {

    private String id;

    private BigDecimal valor;

    private Estabelecimento estabelecimento;

    private Cartao cartao;

    private LocalDateTime efetivadaEm;

    @Deprecated
    public MensagemTransacao(){

    }

    public MensagemTransacao(String id, BigDecimal valor, Estabelecimento estabelecimento, Cartao cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    @Override
    public String toString() {
        return "MensagemTransacao{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", estabelecimento=" + estabelecimento +
                ", cartao=" + cartao +
                ", efetivadaEm=" + efetivadaEm +
                '}';
    }
}
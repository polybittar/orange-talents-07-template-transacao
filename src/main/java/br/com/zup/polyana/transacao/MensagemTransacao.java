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
    public MensagemTransacao() {

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
}
package br.com.zup.polyana.transacao;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(MensagemTransacao mensagemTransacao) {
        System.out.println("ID da Transacao: "+mensagemTransacao.getId());
        System.out.println("Valor da Transacao: "+mensagemTransacao.getValor());
        System.out.println("Estabelecimento: "+mensagemTransacao.getEstabelecimento().getNome());
        System.out.println("Email: "+mensagemTransacao.getCartao().getEmail());
        System.out.println("Data: "+mensagemTransacao.getEfetivadaEm());
    }

}



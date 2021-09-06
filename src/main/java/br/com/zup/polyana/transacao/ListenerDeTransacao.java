package br.com.zup.polyana.transacao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    private final Logger logger = LoggerFactory.getLogger(ListenerDeTransacao.class);

    //topico que vai coletar os eventos
    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(MensagemTransacao mensagemTransacao) {
        logger.info("------------ " + mensagemTransacao.toString() + " ----------------");

    }



}
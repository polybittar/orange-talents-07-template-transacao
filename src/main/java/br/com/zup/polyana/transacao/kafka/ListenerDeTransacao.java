package br.com.zup.polyana.transacao.kafka;

import br.com.zup.polyana.transacao.Transacao;
import br.com.zup.polyana.transacao.TransacaoRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    private TransacaoRepository transacaoRepository;

    public ListenerDeTransacao(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(Transacao mensagemTransacao) {
        System.out.println("ID da Transacao: "+mensagemTransacao.getId());
        System.out.println("Valor da Transacao: "+mensagemTransacao.getValor());
        System.out.println("Estabelecimento: "+mensagemTransacao.getEstabelecimento().getNome());
        System.out.println("Email: "+mensagemTransacao.getCartao().getEmail());
        System.out.println("Data: "+mensagemTransacao.getEfetivadaEm());

        transacaoRepository.save(mensagemTransacao);
    }

}



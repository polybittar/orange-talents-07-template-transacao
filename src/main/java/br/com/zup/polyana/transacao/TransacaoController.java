package br.com.zup.polyana.transacao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
public class TransacaoController {

    private TransacaoRepository transacaoRepository;

    public TransacaoController(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;

    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/transacoes/search/{id}")
    @Transactional
    public ResponseEntity<?> buscaUltimasTransacoes(@PathVariable("id") String id,
                                                    @PageableDefault(sort="efetivadaEm",
                                                            direction = Sort.Direction.DESC,page=0,size=10)
                                                            Pageable paginacao){

        Page<Transacao> transacoes = transacaoRepository.findByCartaoId(id,paginacao);

        if(transacoes.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(transacoes);
    }
}
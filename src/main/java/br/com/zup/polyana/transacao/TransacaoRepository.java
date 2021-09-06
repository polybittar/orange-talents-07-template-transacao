package br.com.zup.polyana.transacao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, String> {
    public Page<Transacao> findByCartaoId(String cartao, Pageable paginacao);
}

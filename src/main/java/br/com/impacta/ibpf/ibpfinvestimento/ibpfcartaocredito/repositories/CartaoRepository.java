package br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.repositories;

import br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.entities.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {
    Cartao findByIdConta(Long id);
}

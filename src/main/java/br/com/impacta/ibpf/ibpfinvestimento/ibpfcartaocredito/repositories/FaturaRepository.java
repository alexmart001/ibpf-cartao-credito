package br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.repositories;

import br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.entities.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaturaRepository extends JpaRepository<Fatura, Long> {
}

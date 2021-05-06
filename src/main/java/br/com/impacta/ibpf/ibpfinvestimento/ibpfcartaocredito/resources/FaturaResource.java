package br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.resources;

import br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.dto.FaturaDTO;
import br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.entities.Fatura;
import br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.repositories.FaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/faturas")
public class FaturaResource {
    @Autowired
    private FaturaRepository faturaRepository;

    @GetMapping("/{id}")
    public ResponseEntity<FaturaDTO> findById(@PathVariable Long id){
        Fatura fatura = faturaRepository.findById(id).get();
        FaturaDTO dto = new FaturaDTO(fatura.getNomeEmpresa(),fatura.getDataCompra(),fatura.getValor());
        return ResponseEntity.ok(dto);
    }
}

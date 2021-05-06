package br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.resources;

import br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.dto.CompraDTO;
import br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.entities.Cartao;
import br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.entities.Fatura;
import br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.repositories.CartaoRepository;
import br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.repositories.FaturaRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/cartoes")
public class CartaoResource {

    @Autowired
    private CartaoRepository cartaoRepository;

    @Autowired
    private FaturaRepository faturaRepository;

    @GetMapping
    public ResponseEntity<Cartao> findById(@PathVariable Long id){
        Cartao cartao = null;
        try{
            cartao = cartaoRepository.findById(id).get();
        } catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.ok(cartao);
    }

    @PostMapping
    public void comprar(@RequestBody CompraDTO compra){
        Cartao c = cartaoRepository.findByIdConta(compra.getIdConta());

        if(compra.getValor() <= c.getLimite()){
            Fatura f = new Fatura();
            f.setValor(compra.getValor());
            f.setNomeEmpresa(compra.getNomeEmpresa());
            f.setDescricao(compra.getDescricao());
            f.setDataCompra(new Date());
            faturaRepository.save(f);
        }
    }
}

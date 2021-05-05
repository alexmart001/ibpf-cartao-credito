package br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.resources;

import br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.entities.Cartao;
import br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.repositories.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cartoes")
public class CartaoResource {

    @Autowired
    private CartaoRepository cartaoRepository;

    @GetMapping
    public ResponseEntity<Cartao> findById(@PathVariable Long id){
        Cartao cartao = cartaoRepository.findById(id).get();
        return ResponseEntity.ok(cartao);
    }

    @PostMapping
    public void comprar(){


    }

}

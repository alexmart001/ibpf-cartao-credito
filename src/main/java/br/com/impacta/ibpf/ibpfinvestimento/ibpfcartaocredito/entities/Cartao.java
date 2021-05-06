package br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TB_CARTOES")
public class Cartao {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "id_conta")
    private Long idConta;

    @Column(name = "numero")
    private Long numero;

    @Column(name = "cvv")
    private Integer cvv;

    @Column(name = "limite")
    private Double limite;

    @Column(name = "vencimento")
    private Date vencimento;

    @OneToMany(mappedBy = "cartao")
    private List<Fatura> faturas;

    public Cartao() {
    }

    public Cartao(Long id, Long idConta, Long numero, Integer cvv, Double limite, Date vencimento, List<Fatura> faturas) {
        this.id = id;
        this.idConta = idConta;
        this.numero = numero;
        this.cvv = cvv;
        this.limite = limite;
        this.vencimento = vencimento;
        this.faturas = faturas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public List<Fatura> getFaturas() {
        return faturas;
    }

    public void setFaturas(List<Fatura> faturas) {
        this.faturas = faturas;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "id=" + id +
                ", idConta=" + idConta +
                ", numero=" + numero +
                ", cvv=" + cvv +
                ", limite=" + limite +
                ", vencimento=" + vencimento +
                ", faturas=" + faturas +
                '}';
    }
}

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
    private Long id_conta;

    @Column(name = "cvv")
    private Integer cvv;

    @Column(name = "limite")
    private Double limite;

    @Column(name = "vencimento")
    private Date vencimento;

    @OneToMany(mappedBy = "cartao")
    private List<Fatura> faturas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_conta() {
        return id_conta;
    }

    public void setId_conta(Long id_conta) {
        this.id_conta = id_conta;
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

    @Override
    public String toString() {
        return "Cartao{" +
                "id=" + id +
                ", id_conta=" + id_conta +
                ", cvv=" + cvv +
                ", limite=" + limite +
                ", vencimento=" + vencimento +
                ", faturas=" + faturas +
                '}';
    }
}

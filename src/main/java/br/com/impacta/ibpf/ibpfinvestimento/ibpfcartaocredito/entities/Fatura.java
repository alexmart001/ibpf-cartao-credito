package br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "TB_FATURAS")
public class Fatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String descricao;

    @Column(name = "nome_empresa")
    private String nomeEmpresa;

    @Column(name = "data_compra")
    private Date dataCompra;

    @Column
    private Double valor;

    @ManyToOne
    private Cartao cartao;

    public Fatura(){

    }

    public Fatura(Long id, String descricao, String nomeEmpresa, Date dataCompra, Double valor, Cartao cartao) {
        this.id = id;
        this.descricao = descricao;
        this.nomeEmpresa = nomeEmpresa;
        this.dataCompra = dataCompra;
        this.valor = valor;
        this.cartao = cartao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String produto) {
        this.descricao = descricao;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "id=" + id +
                ", produto='" + descricao + '\'' +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                ", dataCompra=" + dataCompra +
                ", valor=" + valor +
                ", cartao=" + cartao +
                '}';
    }
}

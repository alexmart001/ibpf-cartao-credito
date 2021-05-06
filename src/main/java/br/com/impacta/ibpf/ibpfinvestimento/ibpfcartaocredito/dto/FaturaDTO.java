package br.com.impacta.ibpf.ibpfinvestimento.ibpfcartaocredito.dto;

import java.util.Date;

public class FaturaDTO {
    private String nomeEmpresa;
    private Date dataCompra;
    private Double valor;

    public FaturaDTO(String nomeEmpresa, Date dataCompra, Double valor) {
        this.nomeEmpresa = nomeEmpresa;
        this.dataCompra = dataCompra;
        this.valor = valor;
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
}

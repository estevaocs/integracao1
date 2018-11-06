package br.ufg.inf.invscp.core.model.entity;

import br.ufg.inf.invscp.core.model.enums.MotivoBaixa;
import br.ufg.inf.invscp.core.model.enums.Situacao;

import java.util.Calendar;

public class BemPatrimonial {

    private String numTombamento;
    private Situacao situacao;
    private String denominacao;
    private Calendar dataAquis;
    private String numNotaFiscal;
    private Calendar vidaUtil;
    private String especificacao;
    private String garantia;
    private String marca;
    private Float valorCompra;
    private Float valorAtual;
    private MotivoBaixa motivoDaBaixa;
    private Calendar dataDaBaixa;
    private String obsrBaixa;

    public BemPatrimonial() {
    }

    public String getNumTombamento() {
        return numTombamento;
    }

    public void setNumTombamento(String numTombamento) {
        this.numTombamento = numTombamento;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public String getDenominacao() {
        return denominacao;
    }

    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
    }

    public Calendar getDataAquis() {
        return dataAquis;
    }

    public void setDataAquis(Calendar dataAquis) {
        this.dataAquis = dataAquis;
    }

    public String getNumNotaFiscal() {
        return numNotaFiscal;
    }

    public void setNumNotaFiscal(String numNotaFiscal) {
        this.numNotaFiscal = numNotaFiscal;
    }

    public Calendar getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(Calendar vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Float getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(Float valorAtual) {
        this.valorAtual = valorAtual;
    }

    public MotivoBaixa getMotivoDaBaixa() {
        return motivoDaBaixa;
    }

    public void setMotivoDaBaixa(MotivoBaixa motivoDaBaixa) {
        this.motivoDaBaixa = motivoDaBaixa;
    }

    public Calendar getDataDaBaixa() {
        return dataDaBaixa;
    }

    public void setDataDaBaixa(Calendar dataDaBaixa) {
        this.dataDaBaixa = dataDaBaixa;
    }

    public String getObsrBaixa() {
        return obsrBaixa;
    }

    public void setObsrBaixa(String obsrBaixa) {
        this.obsrBaixa = obsrBaixa;
    }
}

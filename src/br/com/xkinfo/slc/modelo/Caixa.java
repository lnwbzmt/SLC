package br.com.xkinfo.slc.modelo;


import java.io.Serializable;

import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CAIXA")
public  class Caixa implements Serializable {


    @Column(name="DATARECEBIMENTO",table="CAIXA",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datarecebimento;


    @ManyToOne(optional=false,targetEntity=Fatura.class)
    @JoinColumn(name="FATURA",referencedColumnName="ID",insertable=true,nullable=true,unique=false,updatable=true)
    private Fatura fatura;


    @Column(name="VALORRECEBIDO",table="CAIXA",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=12)
    @Basic
    private Float valorrecebido;


    @Column(name="OBSERVACAO",table="CAIXA",unique=false,updatable=true,insertable=true,nullable=true,length=200,scale=0,precision=0)
    @Basic
    private String observacao;


    @Column(name="ID",table="CAIXA",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Caixa(){

    }


   public Date getDatarecebimento() {
        return this.datarecebimento;
    }


  public void setDatarecebimento (Date datarecebimento) {
        this.datarecebimento = datarecebimento;
    }



   public Fatura getFatura() {
        return this.fatura;
    }


  public void setFatura (Fatura fatura) {
        this.fatura = fatura;
    }



   public Float getValorrecebido() {
        return this.valorrecebido;
    }


  public void setValorrecebido (Float valorrecebido) {
        this.valorrecebido = valorrecebido;
    }



   public String getObservacao() {
        return this.observacao;
    }


  public void setObservacao (String observacao) {
        this.observacao = observacao;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }

}


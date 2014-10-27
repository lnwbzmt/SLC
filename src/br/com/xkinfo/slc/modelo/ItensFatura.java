package br.com.xkinfo.slc.modelo;


import java.io.Serializable;

import java.lang.Float;
import java.lang.Integer;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ITENSFATURA")
public  class ItensFatura implements Serializable {


    @ManyToOne(optional=false,targetEntity=Fatura.class)
    @JoinColumn(name="FATURA",referencedColumnName="ID",insertable=true,nullable=true,unique=false,updatable=true)
    private Fatura fatura;


    @ManyToOne(optional=false,targetEntity=Itens.class)
    @JoinColumn(name="ITEM",referencedColumnName="ID",insertable=true,nullable=true,unique=false,updatable=true)
    private Itens item;


    @Column(name="ID",table="ITENSFATURA",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="VALORFAIXA",table="ITENSFATURA",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=12)
    @Basic
    private Float valorfaixa;


    @Column(name="CONSUMOFAIXA",table="ITENSFATURA",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Integer consumofaixa;

    public ItensFatura(){

    }


   public Fatura getFatura() {
        return this.fatura;
    }


  public void setFatura (Fatura fatura) {
        this.fatura = fatura;
    }



   public Itens getItem() {
        return this.item;
    }


  public void setItem (Itens item) {
        this.item = item;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public Float getValorfaixa() {
        return this.valorfaixa;
    }


  public void setValorfaixa (Float valorfaixa) {
        this.valorfaixa = valorfaixa;
    }



   public Integer getConsumofaixa() {
        return this.consumofaixa;
    }


  public void setConsumofaixa (Integer consumofaixa) {
        this.consumofaixa = consumofaixa;
    }

}


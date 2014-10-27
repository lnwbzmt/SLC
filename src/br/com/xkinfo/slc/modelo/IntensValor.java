package br.com.xkinfo.slc.modelo;


import java.io.Serializable;

import java.lang.Float;
import java.lang.Integer;
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
@Table(name="INTENSVALOR")
public  class IntensValor implements Serializable {


    @Column(name="DATAINICIO",table="INTENSVALOR",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datainicio;


    @ManyToOne(optional=false,targetEntity=Itens.class)
    @JoinColumn(name="ITEM",referencedColumnName="ID",insertable=true,nullable=true,unique=false,updatable=true)
    private Itens item;


    @Column(name="QTDEFIM",table="INTENSVALOR",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Integer qtdefim;


    @Column(name="DATAFIM",table="INTENSVALOR",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datafim;


    @Column(name="VALOR",table="INTENSVALOR",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=12)
    @Basic
    private Float valor;


    @Column(name="ID",table="INTENSVALOR",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="QTDEINICIO",table="INTENSVALOR",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Integer qtdeinicio;

    public IntensValor(){

    }


   public Date getDatainicio() {
        return this.datainicio;
    }


  public void setDatainicio (Date datainicio) {
        this.datainicio = datainicio;
    }



   public Itens getItem() {
        return this.item;
    }


  public void setItem (Itens item) {
        this.item = item;
    }



   public Integer getQtdefim() {
        return this.qtdefim;
    }


  public void setQtdefim (Integer qtdefim) {
        this.qtdefim = qtdefim;
    }



   public Date getDatafim() {
        return this.datafim;
    }


  public void setDatafim (Date datafim) {
        this.datafim = datafim;
    }



   public Float getValor() {
        return this.valor;
    }


  public void setValor (Float valor) {
        this.valor = valor;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public Integer getQtdeinicio() {
        return this.qtdeinicio;
    }


  public void setQtdeinicio (Integer qtdeinicio) {
        this.qtdeinicio = qtdeinicio;
    }

}


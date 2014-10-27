package br.com.xkinfo.slc.modelo;


import java.io.Serializable;

import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ITENS")
public  class Itens implements Serializable {


    @Column(name="EHCALCULADO",table="ITENS",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Boolean ehcalculado;


    @Column(name="CODIGO",table="ITENS",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int codigo;


    @OneToMany(targetEntity=ItensFatura.class,mappedBy="item")
    private Collection<ItensFatura> itensFaturaCollection;


    @Column(name="ID",table="ITENS",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="FAIXA",table="ITENS",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Integer faixa;


    @OneToMany(targetEntity=ItensValor.class,mappedBy="item")
    private Collection<ItensValor> intensValorCollection;


    @Column(name="DESCRICAO",table="ITENS",unique=false,updatable=true,insertable=true,nullable=false,length=200,scale=0,precision=0)
    @Basic
    private String descricao;

    public Itens(){

    }


    public Boolean isEhcalculado() {
        return this.ehcalculado;
    }


  public void setEhcalculado (Boolean ehcalculado) {
        this.ehcalculado = ehcalculado;
    }



   public int getCodigo() {
        return this.codigo;
    }


  public void setCodigo (int codigo) {
        this.codigo = codigo;
    }



   public Collection<ItensFatura> getItensFaturaCollection() {
        return this.itensFaturaCollection;
    }


  public void setItensFaturaCollection (Collection<ItensFatura> itensFaturaCollection) {
        this.itensFaturaCollection = itensFaturaCollection;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public Integer getFaixa() {
        return this.faixa;
    }


  public void setFaixa (Integer faixa) {
        this.faixa = faixa;
    }



   public Collection<ItensValor> getIntensValorCollection() {
        return this.intensValorCollection;
    }


  public void setIntensValorCollection (Collection<ItensValor> intensValorCollection) {
        this.intensValorCollection = intensValorCollection;
    }



   public String getDescricao() {
        return this.descricao;
    }


  public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

}


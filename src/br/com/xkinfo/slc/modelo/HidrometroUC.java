package br.com.xkinfo.slc.modelo;


import java.io.Serializable;

import java.lang.Integer;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="HIDROMETROUC")
public  class HidrometroUC implements Serializable {


    @Column(name="DATAULTIMALEITURA",table="HIDROMETROUC",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataultimaleitura;


    @Column(name="DATARETIRADA",table="HIDROMETROUC",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataretirada;


    @Column(name="ULTIMALEITURA",table="HIDROMETROUC",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Integer ultimaleitura;


    @ManyToOne(optional=false,targetEntity=Hidrometro.class)
    @JoinColumn(name="HIDROMETRO",referencedColumnName="ID",insertable=true,nullable=true,unique=false,updatable=true)
    private Hidrometro hidrometro;


    @ManyToOne(optional=false,targetEntity=UnidadeConsumidora.class)
    @JoinColumn(name="UNIDADECONSUMIDORA",referencedColumnName="ID",insertable=true,nullable=true,unique=false,updatable=true)
    private UnidadeConsumidora unidadeconsumidora;


    @Column(name="ID",table="HIDROMETROUC",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="DATAINSTALACAO",table="HIDROMETROUC",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datainstalacao;


    @OneToMany(targetEntity=Leitura.class,mappedBy="hidrometrouc")
    private Collection<Leitura> leituraCollection;

    public HidrometroUC(){

    }


   public Date getDataultimaleitura() {
        return this.dataultimaleitura;
    }


  public void setDataultimaleitura (Date dataultimaleitura) {
        this.dataultimaleitura = dataultimaleitura;
    }



   public Date getDataretirada() {
        return this.dataretirada;
    }


  public void setDataretirada (Date dataretirada) {
        this.dataretirada = dataretirada;
    }



   public Integer getUltimaleitura() {
        return this.ultimaleitura;
    }


  public void setUltimaleitura (Integer ultimaleitura) {
        this.ultimaleitura = ultimaleitura;
    }



   public Hidrometro getHidrometro() {
        return this.hidrometro;
    }


  public void setHidrometro (Hidrometro hidrometro) {
        this.hidrometro = hidrometro;
    }



   public UnidadeConsumidora getUnidadeconsumidora() {
        return this.unidadeconsumidora;
    }


  public void setUnidadeconsumidora (UnidadeConsumidora unidadeconsumidora) {
        this.unidadeconsumidora = unidadeconsumidora;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public Date getDatainstalacao() {
        return this.datainstalacao;
    }


  public void setDatainstalacao (Date datainstalacao) {
        this.datainstalacao = datainstalacao;
    }



   public Collection<Leitura> getLeituraCollection() {
        return this.leituraCollection;
    }


  public void setLeituraCollection (Collection<Leitura> leituraCollection) {
        this.leituraCollection = leituraCollection;
    }

}


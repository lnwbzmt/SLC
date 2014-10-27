package br.com.xkinfo.slc.modelo;


import java.io.Serializable;

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
@Table(name="PESSOAUC")
public  class PessoaUC implements Serializable {


    @ManyToOne(optional=false,targetEntity=UnidadeConsumidora.class)
    @JoinColumn(name="UNIDADECONSUMIDORA",referencedColumnName="ID",insertable=true,nullable=true,unique=false,updatable=true)
    private UnidadeConsumidora unidadeconsumidora;


    @Column(name="DATASAIDA",table="PESSOAUC",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datasaida;


    @ManyToOne(optional=false,targetEntity=Pessoa.class)
    @JoinColumn(name="PROPRIETARIO",referencedColumnName="ID",insertable=true,nullable=true,unique=false,updatable=true)
    private Pessoa proprietario;


    @ManyToOne(optional=true,targetEntity=Pessoa.class)
    @JoinColumn(name="INQUILINO",referencedColumnName="ID",insertable=true,nullable=true,unique=false,updatable=true)
    private Pessoa inquilino;


    @Column(name="ID",table="PESSOAUC",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="DATAENTRADA",table="PESSOAUC",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataentrada;

    public PessoaUC(){

    }


   public UnidadeConsumidora getUnidadeconsumidora() {
        return this.unidadeconsumidora;
    }


  public void setUnidadeconsumidora (UnidadeConsumidora unidadeconsumidora) {
        this.unidadeconsumidora = unidadeconsumidora;
    }



   public Date getDatasaida() {
        return this.datasaida;
    }


  public void setDatasaida (Date datasaida) {
        this.datasaida = datasaida;
    }



   public Pessoa getProprietario() {
        return this.proprietario;
    }


  public void setProprietario (Pessoa proprietario) {
        this.proprietario = proprietario;
    }



   public Pessoa getInquilino() {
        return this.inquilino;
    }


  public void setInquilino (Pessoa inquilino) {
        this.inquilino = inquilino;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public Date getDataentrada() {
        return this.dataentrada;
    }


  public void setDataentrada (Date dataentrada) {
        this.dataentrada = dataentrada;
    }

}


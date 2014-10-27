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
@Table(name="CONDOMINIOS")
public  class Condominio implements Serializable {


    @Column(name="CIDADE",table="CONDOMINIOS",unique=false,updatable=true,insertable=true,nullable=false,length=250,scale=0,precision=0)
    @Basic
    private String cidade;


    @Column(name="ESTADO",table="CONDOMINIOS",unique=false,updatable=true,insertable=true,nullable=false,length=250,scale=0,precision=0)
    @Basic
    private String estado;


    @Column(name="COMPLEMENTO",table="CONDOMINIOS",unique=false,updatable=true,insertable=true,nullable=false,length=250,scale=0,precision=0)
    @Basic
    private String complemento;


    @Column(name="SIGLA",table="CONDOMINIOS",unique=false,updatable=true,insertable=true,nullable=false,length=2,scale=0,precision=0)
    @Basic
    private String sigla;


    @Column(name="ENDERECO",table="CONDOMINIOS",unique=false,updatable=true,insertable=true,nullable=false,length=250,scale=0,precision=0)
    @Basic
    private String endereco;


    @Column(name="NUMERO",table="CONDOMINIOS",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int numero;


    @Column(name="BAIRRO",table="CONDOMINIOS",unique=false,updatable=true,insertable=true,nullable=false,length=250,scale=0,precision=0)
    @Basic
    private String bairro;


    @Column(name="NOME",table="CONDOMINIOS",unique=false,updatable=true,insertable=true,nullable=false,length=250,scale=0,precision=0)
    @Basic
    private String nome;


    @Column(name="ID",table="CONDOMINIOS",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="CNPJ",table="CONDOMINIOS",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int cnpj;


    @Column(name="EMAIL",table="CONDOMINIOS",unique=false,updatable=true,insertable=true,nullable=true,length=200,scale=0,precision=0)
    @Basic
    private String email;


    @OneToMany(targetEntity=UnidadeConsumidora.class,mappedBy="condominio")
    private Collection<UnidadeConsumidora> unidadeConsumidoraCollection;

    public Condominio(){

    }

    public Condominio(String cidade, String estado, String complemento, String sigla, String endereco, int numero, String bairro, String nome, int cnpj, String email, Collection<UnidadeConsumidora> unidadeConsumidoraCollection) {
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
        this.sigla = sigla;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.nome = nome;
        this.cnpj = cnpj;
        this.email = email;
        this.unidadeConsumidoraCollection = unidadeConsumidoraCollection;
    }


   public String getCidade() {
        return this.cidade;
    }


  public void setCidade (String cidade) {
        this.cidade = cidade;
    }



   public String getEstado() {
        return this.estado;
    }


  public void setEstado (String estado) {
        this.estado = estado;
    }



   public String getComplemento() {
        return this.complemento;
    }


  public void setComplemento (String complemento) {
        this.complemento = complemento;
    }



   public String getSigla() {
        return this.sigla;
    }


  public void setSigla (String sigla) {
        this.sigla = sigla;
    }



   public String getEndereco() {
        return this.endereco;
    }


  public void setEndereco (String endereco) {
        this.endereco = endereco;
    }



   public int getNumero() {
        return this.numero;
    }


  public void setNumero (int numero) {
        this.numero = numero;
    }



   public String getBairro() {
        return this.bairro;
    }


  public void setBairro (String bairro) {
        this.bairro = bairro;
    }



   public String getNome() {
        return this.nome;
    }


  public void setNome (String nome) {
        this.nome = nome;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public int getCnpj() {
        return this.cnpj;
    }


  public void setCnpj (int cnpj) {
        this.cnpj = cnpj;
    }



   public String getEmail() {
        return this.email;
    }


  public void setEmail (String email) {
        this.email = email;
    }



   public Collection<UnidadeConsumidora> getUnidadeConsumidoraCollection() {
        return this.unidadeConsumidoraCollection;
    }


  public void setUnidadeConsumidoraCollection (Collection<UnidadeConsumidora> unidadeConsumidoraCollection) {
        this.unidadeConsumidoraCollection = unidadeConsumidoraCollection;
    }

}


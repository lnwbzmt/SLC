package br.com.xkinfo.slc.modelo;


import java.io.Serializable;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
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
@Table(name="OCORRENCIAS")
public  class Ocorrencia implements Serializable {


    @Column(name="MINIMA",table="OCORRENCIAS",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Boolean minima;


    @Column(name="CODIGO",table="OCORRENCIAS",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Integer codigo;


    @Column(name="MAXIMA",table="OCORRENCIAS",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Boolean maxima;


    @Column(name="ID",table="OCORRENCIAS",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="MEDIA",table="OCORRENCIAS",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Boolean media;


    @Column(name="DESCRICAO",table="OCORRENCIAS",unique=false,updatable=true,insertable=true,nullable=true,length=200,scale=0,precision=0)
    @Basic
    private String descricao;


    @OneToMany(targetEntity=Leitura.class,mappedBy="ocorrencia")
    private Collection<Leitura> leituraCollection;

    public Ocorrencia(){

    }


    public Boolean isMinima() {
        return this.minima;
    }


  public void setMinima (Boolean minima) {
        this.minima = minima;
    }



   public Integer getCodigo() {
        return this.codigo;
    }


  public void setCodigo (Integer codigo) {
        this.codigo = codigo;
    }



    public Boolean isMaxima() {
        return this.maxima;
    }


  public void setMaxima (Boolean maxima) {
        this.maxima = maxima;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



    public Boolean isMedia() {
        return this.media;
    }


  public void setMedia (Boolean media) {
        this.media = media;
    }



   public String getDescricao() {
        return this.descricao;
    }


  public void setDescricao (String descricao) {
        this.descricao = descricao;
    }



   public Collection<Leitura> getLeituraCollection() {
        return this.leituraCollection;
    }


  public void setLeituraCollection (Collection<Leitura> leituraCollection) {
        this.leituraCollection = leituraCollection;
    }

}


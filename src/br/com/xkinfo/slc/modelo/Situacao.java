package br.com.xkinfo.slc.modelo;


import java.io.Serializable;

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
@Table(name="SITUACOES")
public  class Situacao implements Serializable {


    @OneToMany(targetEntity=Competencia.class,mappedBy="situacao")
    private Collection<Competencia> competenciaCollection;


    @Column(name="CODIGO",table="SITUACOES",unique=false,updatable=true,insertable=true,nullable=true,length=255,scale=0,precision=0)
    @Basic
    private Integer codigo;


    @OneToMany(targetEntity=Fatura.class,mappedBy="situacao")
    private Collection<Fatura> faturaCollection;


    @Column(name="ID",table="SITUACOES",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="DESCRICAO",table="SITUACOES",unique=false,updatable=true,insertable=true,nullable=true,length=200,scale=0,precision=0)
    @Basic
    private String descricao;

    public Situacao(){

    }


   public Collection<Competencia> getCompetenciaCollection() {
        return this.competenciaCollection;
    }


  public void setCompetenciaCollection (Collection<Competencia> competenciaCollection) {
        this.competenciaCollection = competenciaCollection;
    }



   public Integer getCodigo() {
        return this.codigo;
    }


  public void setCodigo (Integer codigo) {
        this.codigo = codigo;
    }



   public Collection<Fatura> getFaturaCollection() {
        return this.faturaCollection;
    }


  public void setFaturaCollection (Collection<Fatura> faturaCollection) {
        this.faturaCollection = faturaCollection;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public String getDescricao() {
        return this.descricao;
    }


  public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

}


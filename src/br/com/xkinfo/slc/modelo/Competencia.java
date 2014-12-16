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
@Table(name="COMPETENCIAS")
public  class Competencia implements Serializable {


    @ManyToOne(optional=false,targetEntity=Situacao.class)
    @JoinColumn(name="SITUACAO",referencedColumnName="ID",insertable=true,nullable=true,unique=false,updatable=true)
    private Situacao situacao;


    @OneToMany(targetEntity=Fatura.class,mappedBy="competencia")
    private Collection<Fatura> faturaCollection;


    @Column(name="ID",table="COMPETENCIAS",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="COMPETENCIA",table="COMPETENCIAS",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date competencia;


    @OneToMany(targetEntity=Leitura.class,mappedBy="competencia")
    private Collection<Leitura> leituraCollection;

    public Competencia(){

    }

    public Competencia(Object object, Object object0, Object object1, Object object2, Object object3, int i, Object object4, String text, int i0, Object object5, Object object6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   public Situacao getSituacao() {
        return this.situacao;
    }


  public void setSituacao (Situacao situacao) {
        this.situacao = situacao;
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



   public Date getCompetencia() {
        return this.competencia;
    }


  public void setCompetencia (Date competencia) {
        this.competencia = competencia;
    }



   public Collection<Leitura> getLeituraCollection() {
        return this.leituraCollection;
    }


  public void setLeituraCollection (Collection<Leitura> leituraCollection) {
        this.leituraCollection = leituraCollection;
    }

}


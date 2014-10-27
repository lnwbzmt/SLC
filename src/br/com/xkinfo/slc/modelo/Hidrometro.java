package br.com.xkinfo.slc.modelo;


import java.io.Serializable;

import java.lang.Integer;
import java.lang.String;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="HIDROMETROS")
public  class Hidrometro implements Serializable {


    @Column(name="NRSERIE",table="HIDROMETROS",unique=false,updatable=true,insertable=true,nullable=false,length=20,scale=0,precision=0)
    @Basic
    private String nrserie;


    @OneToMany(targetEntity=HidrometroUC.class,mappedBy="hidrometro")
    private Collection<HidrometroUC> hidrometroUCCollection;


    @Column(name="ID",table="HIDROMETROS",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="DATAAQUISICAO",table="HIDROMETROS",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataaquisicao;

    public Hidrometro(){

    }


   public String getNrserie() {
        return this.nrserie;
    }


  public void setNrserie (String nrserie) {
        this.nrserie = nrserie;
    }



   public Collection<HidrometroUC> getHidrometroUCCollection() {
        return this.hidrometroUCCollection;
    }


  public void setHidrometroUCCollection (Collection<HidrometroUC> hidrometroUCCollection) {
        this.hidrometroUCCollection = hidrometroUCCollection;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public Date getDataaquisicao() {
        return this.dataaquisicao;
    }


  public void setDataaquisicao (Date dataaquisicao) {
        this.dataaquisicao = dataaquisicao;
    }

}


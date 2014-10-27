package br.com.xkinfo.slc.modelo;


import java.io.Serializable;

import java.lang.Integer;
import java.util.Collection;
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

@Entity
@Table(name="UNIDADESCONSUMIDORAS")
public  class UnidadeConsumidora implements Serializable {


    @OneToMany(targetEntity=HidrometroUC.class,mappedBy="unidadeconsumidora")
    private Collection<HidrometroUC> hidrometroUCCollection;


    @Column(name="NUMERO",table="UNIDADESCONSUMIDORAS",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int numero;


    @ManyToOne(optional=false,targetEntity=Condominio.class)
    @JoinColumn(name="CONDOMINIO",referencedColumnName="ID",insertable=true,nullable=true,unique=false,updatable=true)
    private Condominio condominio;


    @Column(name="ID",table="UNIDADESCONSUMIDORAS",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @OneToMany(targetEntity=PessoaUC.class,mappedBy="unidadeconsumidora")
    private Collection<PessoaUC> pessoaUCCollection;

    public UnidadeConsumidora(){

    }


   public Collection<HidrometroUC> getHidrometroUCCollection() {
        return this.hidrometroUCCollection;
    }


  public void setHidrometroUCCollection (Collection<HidrometroUC> hidrometroUCCollection) {
        this.hidrometroUCCollection = hidrometroUCCollection;
    }



   public int getNumero() {
        return this.numero;
    }


  public void setNumero (int numero) {
        this.numero = numero;
    }



   public Condominio getCondominio() {
        return this.condominio;
    }


  public void setCondominio (Condominio condominio) {
        this.condominio = condominio;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public Collection<PessoaUC> getPessoaUCCollection() {
        return this.pessoaUCCollection;
    }


  public void setPessoaUCCollection (Collection<PessoaUC> pessoaUCCollection) {
        this.pessoaUCCollection = pessoaUCCollection;
    }

}


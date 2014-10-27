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
@Table(name="PESSOAS")
public  class Pessoa implements Serializable {


    @Column(name="CPF",table="PESSOAS",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Basic
    private int cpf;


    @Column(name="NOME",table="PESSOAS",unique=false,updatable=true,insertable=true,nullable=false,length=200,scale=0,precision=0)
    @Basic
    private String nome;


    @OneToMany(targetEntity=PessoaUC.class,mappedBy="inquilino")
    private Collection<PessoaUC> pessoaUCCollection1;


    @Column(name="ID",table="PESSOAS",unique=false,updatable=true,insertable=true,nullable=false,length=255,scale=0,precision=0)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="EMAIL",table="PESSOAS",unique=false,updatable=true,insertable=true,nullable=true,length=200,scale=0,precision=0)
    @Basic
    private String email;


    @OneToMany(targetEntity=PessoaUC.class,mappedBy="proprietario")
    private Collection<PessoaUC> pessoaUCCollection;

    public Pessoa(){

    }


   public int getCpf() {
        return this.cpf;
    }


  public void setCpf (int cpf) {
        this.cpf = cpf;
    }



   public String getNome() {
        return this.nome;
    }


  public void setNome (String nome) {
        this.nome = nome;
    }



   public Collection<PessoaUC> getPessoaUCCollection1() {
        return this.pessoaUCCollection1;
    }


  public void setPessoaUCCollection1 (Collection<PessoaUC> pessoaUCCollection1) {
        this.pessoaUCCollection1 = pessoaUCCollection1;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public String getEmail() {
        return this.email;
    }


  public void setEmail (String email) {
        this.email = email;
    }



   public Collection<PessoaUC> getPessoaUCCollection() {
        return this.pessoaUCCollection;
    }


  public void setPessoaUCCollection (Collection<PessoaUC> pessoaUCCollection) {
        this.pessoaUCCollection = pessoaUCCollection;
    }

}


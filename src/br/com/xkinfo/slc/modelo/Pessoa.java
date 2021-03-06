package br.com.xkinfo.slc.modelo;

import java.io.Serializable;
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
@Table(name = "PESSOAS")
public class Pessoa implements Serializable {

    @Column(name = "ID", table = "PESSOAS", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NOME", table = "PESSOAS", length = 200)
    @Basic
    private String nome;

    @Column(name = "CPF", table = "PESSOAS", nullable = false)
    @Basic
    private long cpf;

    @Column(name = "EMAIL", table = "PESSOAS", length = 200)
    @Basic
    private String email;

    @ManyToOne(optional = false, targetEntity = Usuario.class)
    @JoinColumn(name = "USUARIOINCLUSAO", referencedColumnName = "ID")
    private Usuario usuarioinclusao;

    @Column(name = "DATAINCLUSAO", table = "PESSOAS")
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date datainclusao;

    @ManyToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "USUARIOALTERACAO", referencedColumnName = "ID")
    private Usuario usuarioalteracao;

    @Column(name = "DATAALTERACAO", table = "PESSOAS")
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date dataalteracao;

    @OneToMany(targetEntity = PessoaUc.class, mappedBy = "proprietario")
    private Collection<PessoaUc> pessoaUcCollection;

    @OneToMany(targetEntity = PessoaUc.class, mappedBy = "inquilino")
    private Collection<PessoaUc> pessoaUcCollection1;

    public Pessoa() {

    }

    public Collection<PessoaUc> getPessoaUcCollection() {
        return this.pessoaUcCollection;
    }

    public void setPessoaUcCollection(Collection<PessoaUc> pessoaUcCollection) {
        this.pessoaUcCollection = pessoaUcCollection;
    }

    public Usuario getUsuarioalteracao() {
        return this.usuarioalteracao;
    }

    public void setUsuarioalteracao(Usuario usuarioalteracao) {
        this.usuarioalteracao = usuarioalteracao;
    }

    public Collection<PessoaUc> getPessoaUcCollection1() {
        return this.pessoaUcCollection1;
    }

    public void setPessoaUcCollection1(Collection<PessoaUc> pessoaUcCollection1) {
        this.pessoaUcCollection1 = pessoaUcCollection1;
    }

    public Date getDatainclusao() {
        return this.datainclusao;
    }

    public void setDatainclusao(Date datainclusao) {
        this.datainclusao = datainclusao;
    }

    public Usuario getUsuarioinclusao() {
        return this.usuarioinclusao;
    }

    public void setUsuarioinclusao(Usuario usuarioinclusao) {
        this.usuarioinclusao = usuarioinclusao;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataalteracao() {
        return this.dataalteracao;
    }

    public void setDataalteracao(Date dataalteracao) {
        this.dataalteracao = dataalteracao;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return getNome();
    }
}

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
@Table(name = "USUARIOS")
public class Usuario implements Serializable {

    /*
     CAMPOS DA TABELA:
     * ID;
     * NOME;
     * USUARIO;
     * SENHA;
     ** AUDITORIA **
     * USUARIO INCLUSAO;
     * DATA INCLUSAO;
     * USUARIO ALTERACAO;
     * DATA ALTERACAO;
     */
    @OneToMany(targetEntity = PessoaUc.class, mappedBy = "usuarioinclusao")
    private Collection<PessoaUc> pessoaUcCollection1;

    @OneToMany(targetEntity = Condominio.class, mappedBy = "usuarioalteracao")
    private Collection<Condominio> condominioCollection1;

    @OneToMany(targetEntity = Usuario.class, mappedBy = "usuarioinclusao")
    private Collection<Usuario> usuarioCollection;

    @OneToMany(targetEntity = Hidrometro.class, mappedBy = "usuarioinclusao")
    private Collection<Hidrometro> hidrometroCollection;

    @Column(name = "SENHA", table = "USUARIOS", nullable = false, length = 200)
    @Basic
    private String senha;

    @OneToMany(targetEntity = Competencia.class, mappedBy = "usuarioalteracao")
    private Collection<Competencia> competenciaCollection;

    @ManyToOne(optional = false, targetEntity = Usuario.class)
    @JoinColumn(name = "USUARIOINCLUSAO", referencedColumnName = "ID")
    private Usuario usuarioinclusao;

    @OneToMany(targetEntity = UnidadeConsumidora.class, mappedBy = "usuarioinclusao")
    private Collection<UnidadeConsumidora> unidadeConsumidoraCollection1;

    @Column(name = "ID", table = "USUARIOS", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(targetEntity = Hidrometro.class, mappedBy = "usuarioalteracao")
    private Collection<Hidrometro> hidrometroCollection1;

    @OneToMany(targetEntity = PessoaUc.class, mappedBy = "usuarioalteracao")
    private Collection<PessoaUc> pessoaUcCollection;

    @OneToMany(targetEntity = HidrometroUc.class, mappedBy = "usuarioinclusao")
    private Collection<HidrometroUc> hidrometroUcCollection1;

    @Column(name = "DATAINCLUSAO", table = "USUARIOS", nullable = false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datainclusao;

    @Column(name = "NOME", table = "USUARIOS", nullable = false, length = 200)
    @Basic
    private String nome;

    @OneToMany(targetEntity = Situacao.class, mappedBy = "usuarioalteracao")
    private Collection<Situacao> situacaoCollection1;

    @OneToMany(targetEntity = Competencia.class, mappedBy = "usuarioinclusao")
    private Collection<Competencia> competenciaCollection1;

    @OneToMany(targetEntity = UnidadeConsumidora.class, mappedBy = "usuarioalteracao")
    private Collection<UnidadeConsumidora> unidadeConsumidoraCollection;

    @OneToMany(targetEntity = Situacao.class, mappedBy = "usuarioinclusao")
    private Collection<Situacao> situacaoCollection;

    @OneToMany(targetEntity = Pessoa.class, mappedBy = "usuarioinclusao")
    private Collection<Pessoa> pessoaCollection;

    @ManyToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "USUARIOALTERACAO", referencedColumnName = "ID")
    private Usuario usuarioalteracao;

    @OneToMany(targetEntity = Condominio.class, mappedBy = "usuarioinclusao")
    private Collection<Condominio> condominioCollection;

    @OneToMany(targetEntity = Pessoa.class, mappedBy = "usuarioalteracao")
    private Collection<Pessoa> pessoaCollection1;

    @OneToMany(targetEntity = HidrometroUc.class, mappedBy = "usuarioalteracao")
    private Collection<HidrometroUc> hidrometroUcCollection;

    @Column(name = "USUARIO", table = "USUARIOS", nullable = false, length = 20)
    @Basic
    private String usuario;

    @Column(name = "DATAALTERACAO", table = "USUARIOS")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataalteracao;

    @OneToMany(targetEntity = Usuario.class, mappedBy = "usuarioalteracao")
    private Collection<Usuario> usuarioCollection1;

    public Usuario() {

    }

    public Collection<PessoaUc> getPessoaUcCollection1() {
        return this.pessoaUcCollection1;
    }

    public void setPessoaUcCollection1(Collection<PessoaUc> pessoaUcCollection1) {
        this.pessoaUcCollection1 = pessoaUcCollection1;
    }

    public Collection<Condominio> getCondominioCollection1() {
        return this.condominioCollection1;
    }

    public void setCondominioCollection1(Collection<Condominio> condominioCollection1) {
        this.condominioCollection1 = condominioCollection1;
    }

    public Collection<Usuario> getUsuarioCollection() {
        return this.usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    public Collection<Hidrometro> getHidrometroCollection() {
        return this.hidrometroCollection;
    }

    public void setHidrometroCollection(Collection<Hidrometro> hidrometroCollection) {
        this.hidrometroCollection = hidrometroCollection;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Collection<Competencia> getCompetenciaCollection() {
        return this.competenciaCollection;
    }

    public void setCompetenciaCollection(Collection<Competencia> competenciaCollection) {
        this.competenciaCollection = competenciaCollection;
    }

    public Usuario getUsuarioinclusao() {
        return this.usuarioinclusao;
    }

    public void setUsuarioinclusao(Usuario usuarioinclusao) {
        this.usuarioinclusao = usuarioinclusao;
    }

    public Collection<UnidadeConsumidora> getUnidadeConsumidoraCollection1() {
        return this.unidadeConsumidoraCollection1;
    }

    public void setUnidadeConsumidoraCollection1(Collection<UnidadeConsumidora> unidadeConsumidoraCollection1) {
        this.unidadeConsumidoraCollection1 = unidadeConsumidoraCollection1;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collection<Hidrometro> getHidrometroCollection1() {
        return this.hidrometroCollection1;
    }

    public void setHidrometroCollection1(Collection<Hidrometro> hidrometroCollection1) {
        this.hidrometroCollection1 = hidrometroCollection1;
    }

    public Collection<PessoaUc> getPessoaUcCollection() {
        return this.pessoaUcCollection;
    }

    public void setPessoaUcCollection(Collection<PessoaUc> pessoaUcCollection) {
        this.pessoaUcCollection = pessoaUcCollection;
    }

    public Collection<HidrometroUc> getHidrometroUcCollection1() {
        return this.hidrometroUcCollection1;
    }

    public void setHidrometroUcCollection1(Collection<HidrometroUc> hidrometroUcCollection1) {
        this.hidrometroUcCollection1 = hidrometroUcCollection1;
    }

    public Date getDatainclusao() {
        return this.datainclusao;
    }

    public void setDatainclusao(Date datainclusao) {
        this.datainclusao = datainclusao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Situacao> getSituacaoCollection1() {
        return this.situacaoCollection1;
    }

    public void setSituacaoCollection1(Collection<Situacao> situacaoCollection1) {
        this.situacaoCollection1 = situacaoCollection1;
    }

    public Collection<Competencia> getCompetenciaCollection1() {
        return this.competenciaCollection1;
    }

    public void setCompetenciaCollection1(Collection<Competencia> competenciaCollection1) {
        this.competenciaCollection1 = competenciaCollection1;
    }

    public Collection<UnidadeConsumidora> getUnidadeConsumidoraCollection() {
        return this.unidadeConsumidoraCollection;
    }

    public void setUnidadeConsumidoraCollection(Collection<UnidadeConsumidora> unidadeConsumidoraCollection) {
        this.unidadeConsumidoraCollection = unidadeConsumidoraCollection;
    }

    public Collection<Situacao> getSituacaoCollection() {
        return this.situacaoCollection;
    }

    public void setSituacaoCollection(Collection<Situacao> situacaoCollection) {
        this.situacaoCollection = situacaoCollection;
    }

    public Collection<Pessoa> getPessoaCollection() {
        return this.pessoaCollection;
    }

    public void setPessoaCollection(Collection<Pessoa> pessoaCollection) {
        this.pessoaCollection = pessoaCollection;
    }

    public Usuario getUsuarioalteracao() {
        return this.usuarioalteracao;
    }

    public void setUsuarioalteracao(Usuario usuarioalteracao) {
        this.usuarioalteracao = usuarioalteracao;
    }

    public Collection<Condominio> getCondominioCollection() {
        return this.condominioCollection;
    }

    public void setCondominioCollection(Collection<Condominio> condominioCollection) {
        this.condominioCollection = condominioCollection;
    }

    public Collection<Pessoa> getPessoaCollection1() {
        return this.pessoaCollection1;
    }

    public void setPessoaCollection1(Collection<Pessoa> pessoaCollection1) {
        this.pessoaCollection1 = pessoaCollection1;
    }

    public Collection<HidrometroUc> getHidrometroUcCollection() {
        return this.hidrometroUcCollection;
    }

    public void setHidrometroUcCollection(Collection<HidrometroUc> hidrometroUcCollection) {
        this.hidrometroUcCollection = hidrometroUcCollection;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getDataalteracao() {
        return this.dataalteracao;
    }

    public void setDataalteracao(Date dataalteracao) {
        this.dataalteracao = dataalteracao;
    }

    public Collection<Usuario> getUsuarioCollection1() {
        return this.usuarioCollection1;
    }

    public void setUsuarioCollection1(Collection<Usuario> usuarioCollection1) {
        this.usuarioCollection1 = usuarioCollection1;
    }

}

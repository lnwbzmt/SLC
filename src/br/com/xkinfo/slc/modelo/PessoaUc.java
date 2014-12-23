package br.com.xkinfo.slc.modelo;

import java.io.Serializable;
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
@Table(name = "PESSOAUC")
public class PessoaUc implements Serializable {

    @ManyToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "USUARIOALTERACAO", referencedColumnName = "ID")
    private Usuario usuarioalteracao;

    @ManyToOne(optional = false, targetEntity = UnidadeConsumidora.class)
    @JoinColumn(name = "UNIDADECONSUMIDORA", referencedColumnName = "ID")
    private UnidadeConsumidora unidadeconsumidora;

    @Column(name = "DATASAIDA", table = "PESSOAUC")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datasaida;

    @ManyToOne(optional = false, targetEntity = Pessoa.class)
    @JoinColumn(name = "PROPRIETARIO", referencedColumnName = "ID")
    private Pessoa proprietario;

    @Column(name = "DATAINCLUSAO", table = "PESSOAUC", nullable = false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datainclusao;

    @ManyToOne(optional = false, targetEntity = Usuario.class)
    @JoinColumn(name = "USUARIOINCLUSAO", referencedColumnName = "ID")
    private Usuario usuarioinclusao;

    @ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "INQUILINO", referencedColumnName = "ID")
    private Pessoa inquilino;

    @Column(name = "ID", table = "PESSOAUC", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "DATAALTERACAO", table = "PESSOAUC")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataalteracao;

    @Column(name = "DATAENTRADA", table = "PESSOAUC", nullable = false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataentrada;

    public PessoaUc() {

    }

    public Usuario getUsuarioalteracao() {
        return this.usuarioalteracao;
    }

    public void setUsuarioalteracao(Usuario usuarioalteracao) {
        this.usuarioalteracao = usuarioalteracao;
    }

    public UnidadeConsumidora getUnidadeconsumidora() {
        return this.unidadeconsumidora;
    }

    public void setUnidadeconsumidora(UnidadeConsumidora unidadeconsumidora) {
        this.unidadeconsumidora = unidadeconsumidora;
    }

    public Date getDatasaida() {
        return this.datasaida;
    }

    public void setDatasaida(Date datasaida) {
        this.datasaida = datasaida;
    }

    public Pessoa getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
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

    public Pessoa getInquilino() {
        return this.inquilino;
    }

    public void setInquilino(Pessoa inquilino) {
        this.inquilino = inquilino;
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

    public Date getDataentrada() {
        return this.dataentrada;
    }

    public void setDataentrada(Date dataentrada) {
        this.dataentrada = dataentrada;
    }

}

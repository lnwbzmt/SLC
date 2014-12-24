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
@Table(name = "FATURAS")
public class Fatura implements Serializable {

    @Column(name = "VALORRECEBIDO", table = "FATURAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 12)
    @Basic
    private Float valorrecebido;

    @ManyToOne(optional = false, targetEntity = Situacao.class)
    @JoinColumn(name = "SITUACAO", referencedColumnName = "ID", insertable = true, nullable = true, unique = false, updatable = true)
    private Situacao situacao;

    @Column(name = "CONSUMOMEDIDO", table = "FATURAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Integer consumomedido;

    @Column(name = "NUMERO", table = "FATURAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Integer numero;

    @OneToMany(targetEntity = Caixa.class, mappedBy = "fatura")
    private Collection<Caixa> caixaCollection;

    @Column(name = "NOME", table = "FATURAS", unique = false, updatable = true, insertable = true, nullable = true, length = 200, scale = 0, precision = 0)
    @Basic
    private String nome;

    @Column(name = "MEDIA", table = "FATURAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Boolean media;

    @Column(name = "DIASCONSUMO", table = "FATURAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Integer diasconsumo;

    @ManyToOne(optional = false, targetEntity = Competencia.class)
    @JoinColumn(name = "COMPETENCIA", referencedColumnName = "ID", insertable = true, nullable = true, unique = false, updatable = true)
    private Competencia competencia;

    @Column(name = "DATAPAGAMENTO", table = "FATURAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datapagamento;

    @OneToMany(targetEntity = ItensFatura.class, mappedBy = "fatura")
    private Collection<ItensFatura> itensFaturaCollection;

    @ManyToOne(optional = false, targetEntity = Leitura.class)
    @JoinColumn(name = "LEITURA", referencedColumnName = "ID", insertable = true, nullable = true, unique = false, updatable = true)
    private Leitura leitura;

    @Column(name = "DATAVENCIMENTO", table = "FATURAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datavencimento;

    @Column(name = "VALORTOTAL", table = "FATURAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 12)
    @Basic
    private Float valortotal;

    @Column(name = "ID", table = "FATURAS", unique = false, updatable = true, insertable = true, nullable = false, length = 255, scale = 0, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "CONSUMOFATURADO", table = "FATURAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Integer consumofaturado;

    public Fatura() {

    }

    public Float getValorrecebido() {
        return this.valorrecebido;
    }

    public void setValorrecebido(Float valorrecebido) {
        this.valorrecebido = valorrecebido;
    }

    public Situacao getSituacao() {
        return this.situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Integer getConsumomedido() {
        return this.consumomedido;
    }

    public void setConsumomedido(Integer consumomedido) {
        this.consumomedido = consumomedido;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Collection<Caixa> getCaixaCollection() {
        return this.caixaCollection;
    }

    public void setCaixaCollection(Collection<Caixa> caixaCollection) {
        this.caixaCollection = caixaCollection;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean isMedia() {
        return this.media;
    }

    public void setMedia(Boolean media) {
        this.media = media;
    }

    public Integer getDiasconsumo() {
        return this.diasconsumo;
    }

    public void setDiasconsumo(Integer diasconsumo) {
        this.diasconsumo = diasconsumo;
    }

    public Competencia getCompetencia() {
        return this.competencia;
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }

    public Date getDatapagamento() {
        return this.datapagamento;
    }

    public void setDatapagamento(Date datapagamento) {
        this.datapagamento = datapagamento;
    }

    public Collection<ItensFatura> getItensFaturaCollection() {
        return this.itensFaturaCollection;
    }

    public void setItensFaturaCollection(Collection<ItensFatura> itensFaturaCollection) {
        this.itensFaturaCollection = itensFaturaCollection;
    }

    public Leitura getLeitura() {
        return this.leitura;
    }

    public void setLeitura(Leitura leitura) {
        this.leitura = leitura;
    }

    public Date getDatavencimento() {
        return this.datavencimento;
    }

    public void setDatavencimento(Date datavencimento) {
        this.datavencimento = datavencimento;
    }

    public Float getValortotal() {
        return this.valortotal;
    }

    public void setValortotal(Float valortotal) {
        this.valortotal = valortotal;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConsumofaturado() {
        return this.consumofaturado;
    }

    public void setConsumofaturado(Integer consumofaturado) {
        this.consumofaturado = consumofaturado;
    }

}

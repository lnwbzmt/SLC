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
@Table(name = "OCORRENCIAS")
public class Ocorrencia implements Serializable {

    @Column(name = "MINIMA", table = "OCORRENCIAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Boolean minima;

    @Column(name = "CODIGO", table = "OCORRENCIAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Integer codigo;

    @Column(name = "MAXIMA", table = "OCORRENCIAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Boolean maxima;

    @Column(name = "ID", table = "OCORRENCIAS", unique = false, updatable = true, insertable = true, nullable = false, length = 255, scale = 0, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "MEDIA", table = "OCORRENCIAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Boolean media;

    @Column(name = "DESCRICAO", table = "OCORRENCIAS", unique = false, updatable = true, insertable = true, nullable = true, length = 200, scale = 0, precision = 0)
    @Basic
    private String descricao;

    @OneToMany(targetEntity = Leitura.class, mappedBy = "ocorrencia")
    private Collection<Leitura> leituraCollection;

    @Column(name = "DATAINCLUSAO", table = "OCORRENCIAS", nullable = false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datainclusao;

    @ManyToOne(targetEntity = Ocorrencia.class)
    @JoinColumn(name = "USUARIOALTERACAO", referencedColumnName = "ID")
    private Usuario usuarioalteracao;

    @ManyToOne(optional = false, targetEntity = Ocorrencia.class)
    @JoinColumn(name = "USUARIOINCLUSAO", referencedColumnName = "ID")
    private Usuario usuarioinclusao;

    @Column(name = "DATAALTERACAO", table = "OCORRENCIAS", nullable = true)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataalteracao;

    public Ocorrencia() {

    }

    public Boolean isMinima() {
        return this.minima;
    }

    public void setMinima(Boolean minima) {
        this.minima = minima;
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Boolean isMaxima() {
        return this.maxima;
    }

    public void setMaxima(Boolean maxima) {
        this.maxima = maxima;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean isMedia() {
        return this.media;
    }

    public void setMedia(Boolean media) {
        this.media = media;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Collection<Leitura> getLeituraCollection() {
        return this.leituraCollection;
    }

    public void setLeituraCollection(Collection<Leitura> leituraCollection) {
        this.leituraCollection = leituraCollection;
    }

    public Date getDataalteracao() {
        return dataalteracao;
    }

    public void setDataalteracao(Date dataalteracao) {
        this.dataalteracao = dataalteracao;
    }

    public Date getDatainclusao() {
        return datainclusao;
    }

    public void setDatainclusao(Date datainclusao) {
        this.datainclusao = datainclusao;
    }

    public Usuario getUsuarioalteracao() {
        return usuarioalteracao;
    }

    public void setUsuarioalteracao(Usuario usuarioalteracao) {
        this.usuarioalteracao = usuarioalteracao;
    }

    public Usuario getUsuarioinclusao() {
        return usuarioinclusao;
    }

    public void setUsuarioinclusao(Usuario usuarioinclusao) {
        this.usuarioinclusao = usuarioinclusao;
    }
}

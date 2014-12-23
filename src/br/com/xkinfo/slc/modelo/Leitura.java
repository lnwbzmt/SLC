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
@Table(name = "LEITURAS")
public class Leitura implements Serializable {

    @Column(name = "DATALEITURA", table = "LEITURAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataleitura;

    @Column(name = "CONSUMO", table = "LEITURAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Integer consumo;

    @ManyToOne(optional = false, targetEntity = Ocorrencia.class)
    @JoinColumn(name = "OCORRENCIA", referencedColumnName = "ID", insertable = true, nullable = true, unique = false, updatable = true)
    private Ocorrencia ocorrencia;

    @OneToMany(targetEntity = Fatura.class, mappedBy = "leitura")
    private Collection<Fatura> faturaCollection;

    @Column(name = "LEITURA", table = "LEITURAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Integer leitura;

    @ManyToOne(optional = false, targetEntity = HidrometroUc.class)
    @JoinColumn(name = "HIDROMETROUC", referencedColumnName = "ID", insertable = true, nullable = true, unique = false, updatable = true)
    private HidrometroUc hidrometrouc;

    @Column(name = "ID", table = "LEITURAS", unique = false, updatable = true, insertable = true, nullable = false, length = 255, scale = 0, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "MEDIA", table = "LEITURAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Boolean media;

    @Column(name = "DIASCONSUMO", table = "LEITURAS", unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private Integer diasconsumo;

    @ManyToOne(optional = false, targetEntity = Competencia.class)
    @JoinColumn(name = "COMPETENCIA", referencedColumnName = "ID", insertable = true, nullable = true, unique = false, updatable = true)
    private Competencia competencia;

    public Leitura() {

    }

    public Date getDataleitura() {
        return this.dataleitura;
    }

    public void setDataleitura(Date dataleitura) {
        this.dataleitura = dataleitura;
    }

    public Integer getConsumo() {
        return this.consumo;
    }

    public void setConsumo(Integer consumo) {
        this.consumo = consumo;
    }

    public Ocorrencia getOcorrencia() {
        return this.ocorrencia;
    }

    public void setOcorrencia(Ocorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public Collection<Fatura> getFaturaCollection() {
        return this.faturaCollection;
    }

    public void setFaturaCollection(Collection<Fatura> faturaCollection) {
        this.faturaCollection = faturaCollection;
    }

    public Integer getLeitura() {
        return this.leitura;
    }

    public void setLeitura(Integer leitura) {
        this.leitura = leitura;
    }

    public HidrometroUc getHidrometrouc() {
        return this.hidrometrouc;
    }

    public void setHidrometrouc(HidrometroUc hidrometrouc) {
        this.hidrometrouc = hidrometrouc;
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

}

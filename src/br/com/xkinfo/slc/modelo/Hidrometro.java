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
@Table(name = "HIDROMETROS")
public class Hidrometro implements Serializable {

    /*
     CAMPOS DA TABELA:
     * ID;
     * NR SERIE;
     * DATA AQUISIÇÃO;
     ** AUDITORIA **
     * USUARIO INCLUSAO;
     * DATA INCLUSAO;
     * USUARIO ALTERACAO;
     * DATA ALTERACAO;
     */
    @Column(name = "NRSERIE", table = "HIDROMETROS", nullable = false, length = 20)
    @Basic
    private String nrserie;

    @ManyToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "USUARIOALTERACAO", referencedColumnName = "ID")
    private Usuario usuarioalteracao;

    @Column(name = "DATAINCLUSAO", table = "HIDROMETROS", nullable = false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datainclusao;

    @ManyToOne(optional = false, targetEntity = Usuario.class)
    @JoinColumn(name = "USUARIOINCLUSAO", referencedColumnName = "ID")
    private Usuario usuarioinclusao;

    @OneToMany(targetEntity = HidrometroUc.class, mappedBy = "hidrometro")
    private Collection<HidrometroUc> hidrometroUcCollection;

    @Column(name = "ID", table = "HIDROMETROS", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "DATAAQUISICAO", table = "HIDROMETROS", nullable = false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataaquisicao;

    @Column(name = "DATAALTERACAO", table = "HIDROMETROS")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataalteracao;

    public Hidrometro() {

    }

    public String getNrserie() {
        return this.nrserie;
    }

    public void setNrserie(String nrserie) {
        this.nrserie = nrserie;
    }

    public Usuario getUsuarioalteracao() {
        return this.usuarioalteracao;
    }

    public void setUsuarioalteracao(Usuario usuarioalteracao) {
        this.usuarioalteracao = usuarioalteracao;
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

    public Collection<HidrometroUc> getHidrometroUcCollection() {
        return this.hidrometroUcCollection;
    }

    public void setHidrometroUcCollection(Collection<HidrometroUc> hidrometroUcCollection) {
        this.hidrometroUcCollection = hidrometroUcCollection;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataaquisicao() {
        return this.dataaquisicao;
    }

    public void setDataaquisicao(Date dataaquisicao) {
        this.dataaquisicao = dataaquisicao;
    }

    public Date getDataalteracao() {
        return this.dataalteracao;
    }

    public void setDataalteracao(Date dataalteracao) {
        this.dataalteracao = dataalteracao;
    }
}

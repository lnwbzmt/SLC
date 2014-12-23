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
@Table(name = "UNIDADESCONSUMIDORAS")
public class UnidadeConsumidora implements Serializable {

    @OneToMany(targetEntity = PessoaUc.class, mappedBy = "unidadeconsumidora")
    private Collection<PessoaUc> pessoaUcCollection;

    @Column(name = "NUMERO", table = "UNIDADESCONSUMIDORAS", nullable = false)
    @Basic
    private int numero;

    @ManyToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "USUARIOALTERACAO", referencedColumnName = "ID")
    private Usuario usuarioalteracao;

    @ManyToOne(optional = false, targetEntity = Condominio.class)
    @JoinColumn(name = "CONDOMINIO", referencedColumnName = "ID")
    private Condominio condominio;

    @Column(name = "DATAINCLUSAO", table = "UNIDADESCONSUMIDORAS", nullable = false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datainclusao;

    @ManyToOne(optional = false, targetEntity = Usuario.class)
    @JoinColumn(name = "USUARIOINCLUSAO", referencedColumnName = "ID")
    private Usuario usuarioinclusao;

    @OneToMany(targetEntity = HidrometroUc.class, mappedBy = "unidadeconsumidora")
    private Collection<HidrometroUc> hidrometroUcCollection;

    @Column(name = "ID", table = "UNIDADESCONSUMIDORAS", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "DATAALTERACAO", table = "UNIDADESCONSUMIDORAS")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataalteracao;

    public UnidadeConsumidora() {

    }

    public Collection<PessoaUc> getPessoaUcCollection() {
        return this.pessoaUcCollection;
    }

    public void setPessoaUcCollection(Collection<PessoaUc> pessoaUcCollection) {
        this.pessoaUcCollection = pessoaUcCollection;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Usuario getUsuarioalteracao() {
        return this.usuarioalteracao;
    }

    public void setUsuarioalteracao(Usuario usuarioalteracao) {
        this.usuarioalteracao = usuarioalteracao;
    }

    public Condominio getCondominio() {
        return this.condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
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

    public Date getDataalteracao() {
        return this.dataalteracao;
    }

    public void setDataalteracao(Date dataalteracao) {
        this.dataalteracao = dataalteracao;
    }

}

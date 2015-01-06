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
@Table(name = "CONDOMINIOS")
public class Condominio implements Serializable {

    /*
     CAMPOS DA TABELA:
     * ID;
     * NOME;
     * CNPJ;
     * ENDERECO;
     * NUMERO;
     * COMPLEMENTO;
     * BAIRRO;
     * CIDADE;
     * ESTADO;
     * SIGLA;
     * EMAIL;
     ** AUDITORIA **
     * USUARIO INCLUSAO;
     * DATA INCLUSAO;
     * USUARIO ALTERACAO;
     * DATA ALTERACAO;
     */
    @Column(name = "CIDADE", table = "CONDOMINIOS", nullable = false, length = 250)
    @Basic
    private String cidade;

    @Column(name = "ESTADO", table = "CONDOMINIOS", nullable = false, length = 250)
    @Basic
    private String estado;

    @Column(name = "SIGLA", table = "CONDOMINIOS", nullable = false, length = 2)
    @Basic
    private String sigla;

    @Column(name = "ENDERECO", table = "CONDOMINIOS", nullable = false, length = 250)
    @Basic
    private String endereco;

    @Column(name = "NUMERO", table = "CONDOMINIOS", nullable = false)
    @Basic
    private Float numero;

    @Column(name = "BAIRRO", table = "CONDOMINIOS", nullable = false, length = 250)
    @Basic
    private String bairro;

    @Column(name = "DATAINCLUSAO", table = "CONDOMINIOS", nullable = false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datainclusao;

    @Column(name = "NOME", table = "CONDOMINIOS", nullable = false, length = 250)
    @Basic
    private String nome;

    @Column(name = "CNPJ", table = "CONDOMINIOS", nullable = false)
    @Basic
    private Float cnpj;

    @OneToMany(targetEntity = UnidadeConsumidora.class, mappedBy = "condominio")
    private Collection<UnidadeConsumidora> unidadeConsumidoraCollection;

    @Column(name = "COMPLEMENTO", table = "CONDOMINIOS", nullable = false, length = 250)
    @Basic
    private String complemento;

    @ManyToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "USUARIOALTERACAO", referencedColumnName = "ID")
    private Usuario usuarioalteracao;

    @ManyToOne(optional = false, targetEntity = Usuario.class)
    @JoinColumn(name = "USUARIOINCLUSAO", referencedColumnName = "ID")
    private Usuario usuarioinclusao;

    @Column(name = "ID", table = "CONDOMINIOS", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "DATAALTERACAO", table = "CONDOMINIOS", nullable = true)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataalteracao;

    @Column(name = "EMAIL", table = "CONDOMINIOS", length = 200)
    @Basic
    private String email;

    public Condominio() {

    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Float getNumero() {
        return this.numero;
    }

    public void setNumero(Float numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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

    public Float getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(Float cnpj) {
        this.cnpj = cnpj;
    }

    public Collection<UnidadeConsumidora> getUnidadeConsumidoraCollection() {
        return this.unidadeConsumidoraCollection;
    }

    public void setUnidadeConsumidoraCollection(Collection<UnidadeConsumidora> unidadeConsumidoraCollection) {
        this.unidadeConsumidoraCollection = unidadeConsumidoraCollection;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Usuario getUsuarioalteracao() {
        return this.usuarioalteracao;
    }

    public void setUsuarioalteracao(Usuario usuarioalteracao) {
        this.usuarioalteracao = usuarioalteracao;
    }

    public Usuario getUsuarioinclusao() {
        return this.usuarioinclusao;
    }

    public void setUsuarioinclusao(Usuario usuarioinclusao) {
        this.usuarioinclusao = usuarioinclusao;
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

}

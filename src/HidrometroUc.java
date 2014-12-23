
import java.io.Serializable;

import java.lang.Integer;
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
@Table(name="HIDROMETROUC")
public  class HidrometroUc implements Serializable {


    @Column(name="DATAULTIMALEITURA",table="HIDROMETROUC")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataultimaleitura;


    @Column(name="DATARETIRADA",table="HIDROMETROUC")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataretirada;


    @Column(name="ULTIMALEITURA",table="HIDROMETROUC")
    @Basic
    private Integer ultimaleitura;


    @ManyToOne(optional=false,targetEntity=Hidrometro.class)
    @JoinColumn(name="HIDROMETRO",referencedColumnName="ID")
    private Hidrometro hidrometro;


    @ManyToOne(targetEntity=Usuario.class)
    @JoinColumn(name="USUARIOALTERACAO",referencedColumnName="ID")
    private Usuario usuarioalteracao;


    @ManyToOne(optional=false,targetEntity=UnidadeConsumidora.class)
    @JoinColumn(name="UNIDADECONSUMIDORA",referencedColumnName="ID")
    private UnidadeConsumidora unidadeconsumidora;


    @Column(name="DATAINCLUSAO",table="HIDROMETROUC",nullable=false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datainclusao;


    @ManyToOne(optional=false,targetEntity=Usuario.class)
    @JoinColumn(name="USUARIOINCLUSAO",referencedColumnName="ID")
    private Usuario usuarioinclusao;


    @Column(name="ID",table="HIDROMETROUC",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="DATAALTERACAO",table="HIDROMETROUC")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataalteracao;


    @Column(name="DATAINSTALACAO",table="HIDROMETROUC",nullable=false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datainstalacao;

    public HidrometroUc(){

    }


   public Date getDataultimaleitura() {
        return this.dataultimaleitura;
    }


  public void setDataultimaleitura (Date dataultimaleitura) {
        this.dataultimaleitura = dataultimaleitura;
    }



   public Date getDataretirada() {
        return this.dataretirada;
    }


  public void setDataretirada (Date dataretirada) {
        this.dataretirada = dataretirada;
    }



   public Integer getUltimaleitura() {
        return this.ultimaleitura;
    }


  public void setUltimaleitura (Integer ultimaleitura) {
        this.ultimaleitura = ultimaleitura;
    }



   public Hidrometro getHidrometro() {
        return this.hidrometro;
    }


  public void setHidrometro (Hidrometro hidrometro) {
        this.hidrometro = hidrometro;
    }



   public Usuario getUsuarioalteracao() {
        return this.usuarioalteracao;
    }


  public void setUsuarioalteracao (Usuario usuarioalteracao) {
        this.usuarioalteracao = usuarioalteracao;
    }



   public UnidadeConsumidora getUnidadeconsumidora() {
        return this.unidadeconsumidora;
    }


  public void setUnidadeconsumidora (UnidadeConsumidora unidadeconsumidora) {
        this.unidadeconsumidora = unidadeconsumidora;
    }



   public Date getDatainclusao() {
        return this.datainclusao;
    }


  public void setDatainclusao (Date datainclusao) {
        this.datainclusao = datainclusao;
    }



   public Usuario getUsuarioinclusao() {
        return this.usuarioinclusao;
    }


  public void setUsuarioinclusao (Usuario usuarioinclusao) {
        this.usuarioinclusao = usuarioinclusao;
    }



   public Integer getId() {
        return this.id;
    }


  public void setId (Integer id) {
        this.id = id;
    }



   public Date getDataalteracao() {
        return this.dataalteracao;
    }


  public void setDataalteracao (Date dataalteracao) {
        this.dataalteracao = dataalteracao;
    }



   public Date getDatainstalacao() {
        return this.datainstalacao;
    }


  public void setDatainstalacao (Date datainstalacao) {
        this.datainstalacao = datainstalacao;
    }

}


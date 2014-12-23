
import java.io.Serializable;

import java.lang.Integer;
import java.lang.String;
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
@Table(name="SITUACOES")
public  class Situacao implements Serializable {


    @OneToMany(targetEntity=Competencia.class,mappedBy="situacao")
    private Collection<Competencia> competenciaCollection;


    @Column(name="CODIGO",table="SITUACOES")
    @Basic
    private Integer codigo;


    @ManyToOne(targetEntity=Usuario.class)
    @JoinColumn(name="USUARIOALTERACAO",referencedColumnName="ID")
    private Usuario usuarioalteracao;


    @Column(name="DATAINCLUSAO",table="SITUACOES",nullable=false)
    @Temporal(TemporalType.DATE)
    @Basic
    private Date datainclusao;


    @ManyToOne(optional=false,targetEntity=Usuario.class)
    @JoinColumn(name="USUARIOINCLUSAO",referencedColumnName="ID")
    private Usuario usuarioinclusao;


    @Column(name="ID",table="SITUACOES",nullable=false)
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name="DATAALTERACAO",table="SITUACOES")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date dataalteracao;


    @Column(name="DESCRICAO",table="SITUACOES",length=200)
    @Basic
    private String descricao;

    public Situacao(){

    }


   public Collection<Competencia> getCompetenciaCollection() {
        return this.competenciaCollection;
    }


  public void setCompetenciaCollection (Collection<Competencia> competenciaCollection) {
        this.competenciaCollection = competenciaCollection;
    }



   public Integer getCodigo() {
        return this.codigo;
    }


  public void setCodigo (Integer codigo) {
        this.codigo = codigo;
    }



   public Usuario getUsuarioalteracao() {
        return this.usuarioalteracao;
    }


  public void setUsuarioalteracao (Usuario usuarioalteracao) {
        this.usuarioalteracao = usuarioalteracao;
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



   public String getDescricao() {
        return this.descricao;
    }


  public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

}


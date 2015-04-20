package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Competencia.class)
public abstract class Competencia_ {

	public static volatile SingularAttribute<Competencia, Situacao> situacao;
	public static volatile SingularAttribute<Competencia, Usuario> usuarioalteracao;
	public static volatile SingularAttribute<Competencia, Usuario> usuarioinclusao;
	public static volatile SingularAttribute<Competencia, Date> datainclusao;
	public static volatile SingularAttribute<Competencia, Integer> id;
	public static volatile SingularAttribute<Competencia, Date> dataalteracao;
	public static volatile SingularAttribute<Competencia, Date> competencia;

}


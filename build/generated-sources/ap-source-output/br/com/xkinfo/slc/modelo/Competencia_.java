package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Competencia.class)
public abstract class Competencia_ {

	public static volatile SingularAttribute<Competencia, Situacao> situacao;
	public static volatile CollectionAttribute<Competencia, Fatura> faturaCollection;
	public static volatile SingularAttribute<Competencia, Integer> id;
	public static volatile SingularAttribute<Competencia, Date> competencia;
	public static volatile CollectionAttribute<Competencia, Leitura> leituraCollection;

}


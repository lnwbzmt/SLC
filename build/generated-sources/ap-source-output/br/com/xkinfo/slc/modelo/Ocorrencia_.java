package br.com.xkinfo.slc.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ocorrencia.class)
public abstract class Ocorrencia_ {

	public static volatile SingularAttribute<Ocorrencia, Boolean> minima;
	public static volatile SingularAttribute<Ocorrencia, Integer> codigo;
	public static volatile SingularAttribute<Ocorrencia, Boolean> maxima;
	public static volatile SingularAttribute<Ocorrencia, Integer> id;
	public static volatile SingularAttribute<Ocorrencia, Boolean> media;
	public static volatile SingularAttribute<Ocorrencia, String> descricao;
	public static volatile CollectionAttribute<Ocorrencia, Leitura> leituraCollection;

}


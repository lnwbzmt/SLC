package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Situacao.class)
public abstract class Situacao_ {

	public static volatile CollectionAttribute<Situacao, Competencia> competenciaCollection;
	public static volatile SingularAttribute<Situacao, Integer> codigo;
	public static volatile SingularAttribute<Situacao, Usuario> usuarioalteracao;
	public static volatile SingularAttribute<Situacao, Date> datainclusao;
	public static volatile SingularAttribute<Situacao, Usuario> usuarioinclusao;
	public static volatile SingularAttribute<Situacao, Integer> id;
	public static volatile SingularAttribute<Situacao, Date> dataalteracao;
	public static volatile SingularAttribute<Situacao, String> descricao;

}


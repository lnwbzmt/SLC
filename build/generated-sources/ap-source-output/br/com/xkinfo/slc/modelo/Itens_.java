package br.com.xkinfo.slc.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Itens.class)
public abstract class Itens_ {

	public static volatile SingularAttribute<Itens, Boolean> ehcalculado;
	public static volatile SingularAttribute<Itens, Integer> codigo;
	public static volatile CollectionAttribute<Itens, ItensFatura> itensFaturaCollection;
	public static volatile SingularAttribute<Itens, Integer> id;
	public static volatile SingularAttribute<Itens, Integer> faixa;
	public static volatile CollectionAttribute<Itens, ItensValor> intensValorCollection;
	public static volatile SingularAttribute<Itens, String> descricao;

}


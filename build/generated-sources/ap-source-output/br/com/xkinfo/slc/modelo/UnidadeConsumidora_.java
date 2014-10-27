package br.com.xkinfo.slc.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UnidadeConsumidora.class)
public abstract class UnidadeConsumidora_ {

	public static volatile CollectionAttribute<UnidadeConsumidora, HidrometroUC> hidrometroUCCollection;
	public static volatile SingularAttribute<UnidadeConsumidora, Integer> numero;
	public static volatile SingularAttribute<UnidadeConsumidora, Condominio> condominio;
	public static volatile SingularAttribute<UnidadeConsumidora, Integer> id;
	public static volatile CollectionAttribute<UnidadeConsumidora, PessoaUC> pessoaUCCollection;

}


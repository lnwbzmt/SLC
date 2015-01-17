package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UnidadeConsumidora.class)
public abstract class UnidadeConsumidora_ {

	public static volatile CollectionAttribute<UnidadeConsumidora, PessoaUc> pessoaUcCollection;
	public static volatile SingularAttribute<UnidadeConsumidora, Integer> numero;
	public static volatile SingularAttribute<UnidadeConsumidora, Usuario> usuarioalteracao;
	public static volatile SingularAttribute<UnidadeConsumidora, Condominio> condominio;
	public static volatile SingularAttribute<UnidadeConsumidora, Date> datainclusao;
	public static volatile SingularAttribute<UnidadeConsumidora, Usuario> usuarioinclusao;
	public static volatile CollectionAttribute<UnidadeConsumidora, HidrometroUc> hidrometroUcCollection;
	public static volatile SingularAttribute<UnidadeConsumidora, Integer> id;
	public static volatile SingularAttribute<UnidadeConsumidora, Date> dataalteracao;

}


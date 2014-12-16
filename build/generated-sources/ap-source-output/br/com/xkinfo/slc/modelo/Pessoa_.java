package br.com.xkinfo.slc.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pessoa.class)
public abstract class Pessoa_ {

	public static volatile SingularAttribute<Pessoa, Integer> cpf;
	public static volatile SingularAttribute<Pessoa, String> nome;
	public static volatile CollectionAttribute<Pessoa, PessoaUC> pessoaUCCollection1;
	public static volatile SingularAttribute<Pessoa, Integer> id;
	public static volatile SingularAttribute<Pessoa, String> email;
	public static volatile CollectionAttribute<Pessoa, PessoaUC> pessoaUCCollection;

}


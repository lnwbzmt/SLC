package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pessoa.class)
public abstract class Pessoa_ {

	public static volatile CollectionAttribute<Pessoa, PessoaUc> pessoaUcCollection;
	public static volatile SingularAttribute<Pessoa, Usuario> usuarioalteracao;
	public static volatile CollectionAttribute<Pessoa, PessoaUc> pessoaUcCollection1;
	public static volatile SingularAttribute<Pessoa, Date> datainclusao;
	public static volatile SingularAttribute<Pessoa, Usuario> usuarioinclusao;
	public static volatile SingularAttribute<Pessoa, Integer> cpf;
	public static volatile SingularAttribute<Pessoa, String> nome;
	public static volatile SingularAttribute<Pessoa, Integer> id;
	public static volatile SingularAttribute<Pessoa, Date> dataalteracao;
	public static volatile SingularAttribute<Pessoa, String> email;

}


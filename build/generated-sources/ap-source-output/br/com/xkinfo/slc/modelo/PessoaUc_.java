package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PessoaUc.class)
public abstract class PessoaUc_ {

	public static volatile SingularAttribute<PessoaUc, Usuario> usuarioalteracao;
	public static volatile SingularAttribute<PessoaUc, UnidadeConsumidora> unidadeconsumidora;
	public static volatile SingularAttribute<PessoaUc, Date> datasaida;
	public static volatile SingularAttribute<PessoaUc, Pessoa> proprietario;
	public static volatile SingularAttribute<PessoaUc, Date> datainclusao;
	public static volatile SingularAttribute<PessoaUc, Usuario> usuarioinclusao;
	public static volatile SingularAttribute<PessoaUc, Pessoa> inquilino;
	public static volatile SingularAttribute<PessoaUc, Integer> id;
	public static volatile SingularAttribute<PessoaUc, Date> dataalteracao;
	public static volatile SingularAttribute<PessoaUc, Date> dataentrada;

}


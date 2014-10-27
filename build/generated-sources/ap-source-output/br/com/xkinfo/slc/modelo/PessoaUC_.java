package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PessoaUC.class)
public abstract class PessoaUC_ {

	public static volatile SingularAttribute<PessoaUC, UnidadeConsumidora> unidadeconsumidora;
	public static volatile SingularAttribute<PessoaUC, Date> datasaida;
	public static volatile SingularAttribute<PessoaUC, Pessoa> proprietario;
	public static volatile SingularAttribute<PessoaUC, Pessoa> inquilino;
	public static volatile SingularAttribute<PessoaUC, Integer> id;
	public static volatile SingularAttribute<PessoaUC, Date> dataentrada;

}


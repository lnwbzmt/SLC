package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Caixa.class)
public abstract class Caixa_ {

	public static volatile SingularAttribute<Caixa, Date> datarecebimento;
	public static volatile SingularAttribute<Caixa, Fatura> fatura;
	public static volatile SingularAttribute<Caixa, Float> valorrecebido;
	public static volatile SingularAttribute<Caixa, String> observacao;
	public static volatile SingularAttribute<Caixa, Integer> id;

}


package br.com.xkinfo.slc.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ItensFatura.class)
public abstract class ItensFatura_ {

	public static volatile SingularAttribute<ItensFatura, Fatura> fatura;
	public static volatile SingularAttribute<ItensFatura, Itens> item;
	public static volatile SingularAttribute<ItensFatura, Integer> id;
	public static volatile SingularAttribute<ItensFatura, Float> valorfaixa;
	public static volatile SingularAttribute<ItensFatura, Integer> consumofaixa;

}


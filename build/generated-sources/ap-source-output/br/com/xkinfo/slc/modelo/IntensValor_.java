package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(IntensValor.class)
public abstract class IntensValor_ {

	public static volatile SingularAttribute<IntensValor, Date> datainicio;
	public static volatile SingularAttribute<IntensValor, Itens> item;
	public static volatile SingularAttribute<IntensValor, Integer> qtdefim;
	public static volatile SingularAttribute<IntensValor, Date> datafim;
	public static volatile SingularAttribute<IntensValor, Float> valor;
	public static volatile SingularAttribute<IntensValor, Integer> id;
	public static volatile SingularAttribute<IntensValor, Integer> qtdeinicio;

}


package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Hidrometro.class)
public abstract class Hidrometro_ {

	public static volatile SingularAttribute<Hidrometro, String> nrserie;
	public static volatile CollectionAttribute<Hidrometro, HidrometroUC> hidrometroUCCollection;
	public static volatile SingularAttribute<Hidrometro, Integer> id;
	public static volatile SingularAttribute<Hidrometro, Date> dataaquisicao;

}


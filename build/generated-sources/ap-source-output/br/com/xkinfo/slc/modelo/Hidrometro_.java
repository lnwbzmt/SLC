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
	public static volatile SingularAttribute<Hidrometro, Usuario> usuarioalteracao;
	public static volatile SingularAttribute<Hidrometro, Date> datainclusao;
	public static volatile SingularAttribute<Hidrometro, Usuario> usuarioinclusao;
	public static volatile CollectionAttribute<Hidrometro, HidrometroUc> hidrometroUcCollection;
	public static volatile SingularAttribute<Hidrometro, Integer> id;
	public static volatile SingularAttribute<Hidrometro, Date> dataaquisicao;
	public static volatile SingularAttribute<Hidrometro, Date> dataalteracao;

}


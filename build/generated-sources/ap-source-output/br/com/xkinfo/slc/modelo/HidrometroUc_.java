package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(HidrometroUc.class)
public abstract class HidrometroUc_ {

	public static volatile SingularAttribute<HidrometroUc, Date> dataultimaleitura;
	public static volatile SingularAttribute<HidrometroUc, Date> dataretirada;
	public static volatile SingularAttribute<HidrometroUc, Integer> ultimaleitura;
	public static volatile SingularAttribute<HidrometroUc, Hidrometro> hidrometro;
	public static volatile SingularAttribute<HidrometroUc, Usuario> usuarioalteracao;
	public static volatile SingularAttribute<HidrometroUc, UnidadeConsumidora> unidadeconsumidora;
	public static volatile SingularAttribute<HidrometroUc, Date> datainclusao;
	public static volatile SingularAttribute<HidrometroUc, Usuario> usuarioinclusao;
	public static volatile SingularAttribute<HidrometroUc, Integer> id;
	public static volatile SingularAttribute<HidrometroUc, Date> dataalteracao;
	public static volatile SingularAttribute<HidrometroUc, Date> datainstalacao;

}


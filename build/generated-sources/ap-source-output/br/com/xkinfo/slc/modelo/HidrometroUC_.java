package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(HidrometroUC.class)
public abstract class HidrometroUC_ {

	public static volatile SingularAttribute<HidrometroUC, Date> dataultimaleitura;
	public static volatile SingularAttribute<HidrometroUC, Date> dataretirada;
	public static volatile SingularAttribute<HidrometroUC, Integer> ultimaleitura;
	public static volatile SingularAttribute<HidrometroUC, Hidrometro> hidrometro;
	public static volatile SingularAttribute<HidrometroUC, UnidadeConsumidora> unidadeconsumidora;
	public static volatile SingularAttribute<HidrometroUC, Integer> id;
	public static volatile SingularAttribute<HidrometroUC, Date> datainstalacao;
	public static volatile CollectionAttribute<HidrometroUC, Leitura> leituraCollection;

}


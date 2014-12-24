package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Leitura.class)
public abstract class Leitura_ {

	public static volatile SingularAttribute<Leitura, Date> dataleitura;
	public static volatile SingularAttribute<Leitura, Integer> consumo;
	public static volatile SingularAttribute<Leitura, Ocorrencia> ocorrencia;
	public static volatile CollectionAttribute<Leitura, Fatura> faturaCollection;
	public static volatile SingularAttribute<Leitura, Integer> leitura;
	public static volatile SingularAttribute<Leitura, HidrometroUc> hidrometrouc;
	public static volatile SingularAttribute<Leitura, Integer> id;
	public static volatile SingularAttribute<Leitura, Boolean> media;
	public static volatile SingularAttribute<Leitura, Integer> diasconsumo;
	public static volatile SingularAttribute<Leitura, Competencia> competencia;

}


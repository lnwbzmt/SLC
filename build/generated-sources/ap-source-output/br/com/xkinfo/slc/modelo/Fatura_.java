package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Fatura.class)
public abstract class Fatura_ {

	public static volatile SingularAttribute<Fatura, Float> valorrecebido;
	public static volatile SingularAttribute<Fatura, Situacao> situacao;
	public static volatile SingularAttribute<Fatura, Integer> consumomedido;
	public static volatile SingularAttribute<Fatura, Integer> numero;
	public static volatile CollectionAttribute<Fatura, Caixa> caixaCollection;
	public static volatile SingularAttribute<Fatura, String> nome;
	public static volatile SingularAttribute<Fatura, Boolean> media;
	public static volatile SingularAttribute<Fatura, Integer> diasconsumo;
	public static volatile SingularAttribute<Fatura, Competencia> competencia;
	public static volatile SingularAttribute<Fatura, Date> datapagamento;
	public static volatile CollectionAttribute<Fatura, ItensFatura> itensFaturaCollection;
	public static volatile SingularAttribute<Fatura, Leitura> leitura;
	public static volatile SingularAttribute<Fatura, Date> datavencimento;
	public static volatile SingularAttribute<Fatura, Float> valortotal;
	public static volatile SingularAttribute<Fatura, Integer> id;
	public static volatile SingularAttribute<Fatura, Integer> consumofaturado;

}


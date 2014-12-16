package br.com.xkinfo.slc.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Condominio.class)
public abstract class Condominio_ {

	public static volatile SingularAttribute<Condominio, String> cidade;
	public static volatile SingularAttribute<Condominio, String> estado;
	public static volatile SingularAttribute<Condominio, String> complemento;
	public static volatile SingularAttribute<Condominio, String> sigla;
	public static volatile SingularAttribute<Condominio, String> endereco;
	public static volatile SingularAttribute<Condominio, Integer> numero;
	public static volatile SingularAttribute<Condominio, String> bairro;
	public static volatile SingularAttribute<Condominio, String> nome;
	public static volatile SingularAttribute<Condominio, Integer> id;
	public static volatile SingularAttribute<Condominio, Integer> cnpj;
	public static volatile SingularAttribute<Condominio, String> email;
	public static volatile CollectionAttribute<Condominio, UnidadeConsumidora> unidadeConsumidoraCollection;

}


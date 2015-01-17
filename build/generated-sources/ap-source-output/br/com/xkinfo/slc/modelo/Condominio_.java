package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Condominio.class)
public abstract class Condominio_ {

	public static volatile SingularAttribute<Condominio, String> cidade;
	public static volatile SingularAttribute<Condominio, String> estado;
	public static volatile SingularAttribute<Condominio, String> sigla;
	public static volatile SingularAttribute<Condominio, String> endereco;
	public static volatile SingularAttribute<Condominio, Float> numero;
	public static volatile SingularAttribute<Condominio, String> bairro;
	public static volatile SingularAttribute<Condominio, Date> datainclusao;
	public static volatile SingularAttribute<Condominio, String> nome;
	public static volatile SingularAttribute<Condominio, Long> cnpj;
	public static volatile CollectionAttribute<Condominio, UnidadeConsumidora> unidadeConsumidoraCollection;
	public static volatile SingularAttribute<Condominio, String> complemento;
	public static volatile SingularAttribute<Condominio, Usuario> usuarioalteracao;
	public static volatile SingularAttribute<Condominio, Usuario> usuarioinclusao;
	public static volatile SingularAttribute<Condominio, Integer> id;
	public static volatile SingularAttribute<Condominio, Date> dataalteracao;
	public static volatile SingularAttribute<Condominio, String> email;

}


package br.com.xkinfo.slc.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile CollectionAttribute<Usuario, PessoaUc> pessoaUcCollection1;
	public static volatile CollectionAttribute<Usuario, Condominio> condominioCollection1;
	public static volatile CollectionAttribute<Usuario, Usuario> usuarioCollection;
	public static volatile CollectionAttribute<Usuario, Hidrometro> hidrometroCollection;
	public static volatile SingularAttribute<Usuario, String> senha;
	public static volatile CollectionAttribute<Usuario, Competencia> competenciaCollection;
	public static volatile SingularAttribute<Usuario, Usuario> usuarioinclusao;
	public static volatile CollectionAttribute<Usuario, UnidadeConsumidora> unidadeConsumidoraCollection1;
	public static volatile SingularAttribute<Usuario, Integer> id;
	public static volatile CollectionAttribute<Usuario, Hidrometro> hidrometroCollection1;
	public static volatile CollectionAttribute<Usuario, PessoaUc> pessoaUcCollection;
	public static volatile CollectionAttribute<Usuario, HidrometroUc> hidrometroUcCollection1;
	public static volatile SingularAttribute<Usuario, Date> datainclusao;
	public static volatile SingularAttribute<Usuario, String> nome;
	public static volatile CollectionAttribute<Usuario, Situacao> situacaoCollection1;
	public static volatile CollectionAttribute<Usuario, Competencia> competenciaCollection1;
	public static volatile CollectionAttribute<Usuario, UnidadeConsumidora> unidadeConsumidoraCollection;
	public static volatile CollectionAttribute<Usuario, Situacao> situacaoCollection;
	public static volatile CollectionAttribute<Usuario, Pessoa> pessoaCollection;
	public static volatile SingularAttribute<Usuario, Usuario> usuarioalteracao;
	public static volatile CollectionAttribute<Usuario, Condominio> condominioCollection;
	public static volatile CollectionAttribute<Usuario, Pessoa> pessoaCollection1;
	public static volatile CollectionAttribute<Usuario, HidrometroUc> hidrometroUcCollection;
	public static volatile SingularAttribute<Usuario, String> usuario;
	public static volatile SingularAttribute<Usuario, Date> dataalteracao;
	public static volatile CollectionAttribute<Usuario, Usuario> usuarioCollection1;

}


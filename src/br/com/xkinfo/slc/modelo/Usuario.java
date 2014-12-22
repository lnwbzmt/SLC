package br.com.xkinfo.slc.modelo;

import java.io.Serializable;

import java.lang.Integer;
import java.lang.String;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIOS")
public class Usuario implements Serializable {

    @Column(name = "SENHA", table = "USUARIOS", unique = false, updatable = true, insertable = true, nullable = true, length = 20, scale = 0, precision = 0)
    @Basic
    private String senha;

    @Column(name = "NOME", table = "USUARIOS", unique = false, updatable = true, insertable = true, nullable = true, length = 200, scale = 0, precision = 0)
    @Basic
    private String nome;

    @Column(name = "ID", table = "USUARIOS", unique = false, updatable = true, insertable = true, nullable = false, length = 255, scale = 0, precision = 0)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "LOGIN", table = "USUARIOS", unique = false, updatable = true, insertable = true, nullable = true, length = 20, scale = 0, precision = 0)
    @Basic
    private String login;

    public Usuario() {

    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}

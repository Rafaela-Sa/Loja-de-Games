package com.generation.lojagames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O atributo nome é obrigatório!")
    @Size(min = 3, max = 100, message = "o atributo texto deve deve conter no minimo 03 caracteres e no máximo 100 caracteres")
    private String nome;

    @NotNull(message = "O atributo usuario é obrigatório!")
    @Size(min = 3, max = 100, message = "o atributo texto deve deve conter no minimo 03 caracteres e no máximo 100 caracteres")
    private String usuarios;

    @NotNull(message = "O atributo senha é obrigatório!")
    @Size(min = 6, max = 20, message = "o atributo texto deve deve conter no minimo 03 caracteres e no máximo 100 caracteres")
    private String senha;

    private String foto;

    private Date data_nascimento;

    @OneToMany(mappedBy = "usuarios", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("usuarios")
    private List<Produtos> produtos;

    // GETTERS AND SETTERS


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }
}

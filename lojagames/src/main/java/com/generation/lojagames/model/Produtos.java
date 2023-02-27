package com.generation.lojagames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.text.DecimalFormat;

@Entity
@Table(name = "tb_produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O atributo nome é obrigatório!")
    @Size(min = 3, max = 100, message = "o atributo texto deve deve conter no minimo 03 caracteres e no máximo 100 caracteres")
    private String nome;

    private String descricao;


    @NotBlank(message = "O atributo console é obrigatório!")
    @Size(min = 1, max = 100, message = "o atributo texto deve deve conter no minimo 03 caracteres e no máximo 100 caracteres")
    private String console;


    @NotNull(message = "O atributo quantidade é obrigatório!")
    private Integer quantidade;


    @NotNull(message = "O atributo preço é obrigatório!")
    private Double preco;

    private String foto;

    @ManyToOne
    @JsonIgnoreProperties("produtos")
    private Categorias categorias;

    @ManyToOne
    @JsonIgnoreProperties("produtos")
    private Usuarios usuarios;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Categorias getCategorias() {
        return categorias;
    }

    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}

package com.listaDeAmigos.lista_de_amigos.Model;

public class Amigo {

    private int id;
    private String nome;
    private int idade;

    public Amigo(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }


    public Amigo(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Amigo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

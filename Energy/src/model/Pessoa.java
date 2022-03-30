/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Olga Mutisse
 */
public class Pessoa {

    public Pessoa(String apelido, String nome, String passwordInicio, String dataDeNascimento, String estadoCvil, String nacionalidade, String morada, String email, String numeroDeBi, int numeroDeTelefone, int nuit, char genero) {
        this.apelido = apelido;
        this.nome = nome;
        this.passwordInicio = passwordInicio;
        this.dataDeNascimento = dataDeNascimento;
        this.estadoCvil = estadoCvil;
        this.nacionalidade = nacionalidade;
        this.morada = morada;
        this.email = email;
        this.numeroDeBi = numeroDeBi;
        this.numeroDeTelefone = numeroDeTelefone;
        this.nuit = nuit;
        this.genero = genero;
    }
    
    
    
    private String apelido,nome,passwordInicio,dataDeNascimento,estadoCvil,nacionalidade,morada,email,numeroDeBi ;
    private int numeroDeTelefone,nuit;
    private char genero;

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPasswordInicio() {
        return passwordInicio;
    }

    public void setPasswordInicio(String passwordInicio) {
        this.passwordInicio = passwordInicio;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEstadoCvil() {
        return estadoCvil;
    }

    public void setEstadoCvil(String estadoCvil) {
        this.estadoCvil = estadoCvil;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroDeBi() {
        return numeroDeBi;
    }

    public void setNumeroDeBi(String numeroDeBi) {
        this.numeroDeBi = numeroDeBi;
    }

    public int getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(int numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public int getNuit() {
        return nuit;
    }

    public void setNuit(int nuit) {
        this.nuit = nuit;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    
    
}

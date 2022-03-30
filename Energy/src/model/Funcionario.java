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
public class Funcionario extends Pessoa {

    private String funcao, localizacaoInstituicao;
    private int numeroDeFuncionario;


    public Funcionario(String funcao, String localizacaoInstituicao, int numeroDeFuncionario, String apelido, String nome, String passwordInicio, String dataDeNascimento, String estadoCvil, String nacionalidade, String morada, String email, String numeroDeBi, int numeroDeTelefone, int nuit, char genero) {
        super(apelido, nome, passwordInicio, dataDeNascimento, estadoCvil, nacionalidade, morada, email, numeroDeBi, numeroDeTelefone, nuit, genero);
        this.funcao = funcao;
        this.localizacaoInstituicao = localizacaoInstituicao;
        this.numeroDeFuncionario = numeroDeFuncionario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getLocalizacaoInstituicao() {
        return localizacaoInstituicao;
    }

    public void setLocalizacaoInstituicao(String localizacaoInstituicao) {
        this.localizacaoInstituicao = localizacaoInstituicao;
    }

    public int getNumeroDeFuncionario() {
        return numeroDeFuncionario;
    }

    public void setNumeroDeFuncionario(int numeroDeFuncionario) {
        this.numeroDeFuncionario = numeroDeFuncionario;
    }
    
    

}

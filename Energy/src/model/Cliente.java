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
public class Cliente extends Pessoa {

    private int numeroDecontador;
    private String provincia, cidade, localizacaoGoogle;

    public Cliente(int numeroDecontador, String provincia, String cidade, String localizacaoGoogle, String apelido, String nome, String passwordInicio, String dataDeNascimento, String estadoCvil, String nacionalidade, String morada, String email, String numeroDeBi, int numeroDeTelefone, int nuit, char genero) {
        super(apelido, nome, passwordInicio, dataDeNascimento, estadoCvil, nacionalidade, morada, email, numeroDeBi, numeroDeTelefone, nuit, genero);
        this.numeroDecontador = numeroDecontador;
       
        this.provincia = provincia;
        this.cidade = cidade;
        this.localizacaoGoogle = localizacaoGoogle;
    }

    public int getNumeroDecontador() {
        return numeroDecontador;
    }

    public void setNumeroDecontador(int numeroDecontador) {
        this.numeroDecontador = numeroDecontador;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLocalizacaoGoogle() {
        return localizacaoGoogle;
    }

    public void setLocalizacaoGoogle(String localizacaoGoogle) {
        this.localizacaoGoogle = localizacaoGoogle;
    }
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyt;

/**
 *
 * @author gabriel.nascimento
 */
public class Gafanhotos extends Pessoa{
    private String login;
    private int totAssitido;

    public Gafanhotos(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssitido = 0;
        
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssitido() {
        return totAssitido;
    }

    public void setTotAssitido(int totAssitido) {
        this.totAssitido = totAssitido;
    }

    @Override
    public String toString() {
        return "Gafanhotos{" +super.toString()+ "login=" + login + ", totAssitido=" + totAssitido + '}';
    }
    
    
}

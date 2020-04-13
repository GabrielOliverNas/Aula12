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
public class Visualizacao {
    private Gafanhotos espectador;
    private Video filme;

    public Visualizacao(Gafanhotos espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssitido(this.espectador.getTotAssitido()+1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhotos getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhotos espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int x){
        this.filme.setAvaliacao(x);
    }
    public void avaliar(float x){
        int tot;
        if (x<= 20) {
            tot = 3;
            
        } else if(x<= 50){
            tot = 5;
        }else if(x<=90){
            tot = 8;
        }else{
            tot = 10; 
        }
        this.filme.setAvaliacao(tot);
    }
}

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
public class ProjetoYT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML 5");
        
        Gafanhotos g[] = new Gafanhotos[2];
        g[0] = new Gafanhotos("Gabriel", 22, "M", "Juba");
        g[1] = new Gafanhotos("Mauricia", 31, "F", "Creuzita");
        
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); //gabriel assiste html
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]);//gabriel assiste POO
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
    }
    
}

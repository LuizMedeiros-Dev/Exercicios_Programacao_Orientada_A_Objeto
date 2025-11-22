/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ex_floricultura;


public class Floricultura {
    public Floricultura(){
    }

    public static void main(String[] args) {
        Flor rosa = new Flor();
        Flor girassol = new Flor();
        Flor lirio = new Flor();
        Flor margarida = new Flor();
        Flor orquidia = new Flor();
        Flor jasmim = new Flor();
        
        rosa.cor = "Vermelho";
        rosa.aroma = "doce e intenso";
        rosa.formato = "petalas alongadas";
        rosa.petalas = 5;
        
        girassol.cor = "Amarelo";
        girassol.aroma = "Suave";
        girassol.formato = "petalas sobrepostas";
        girassol.petalas = 20;
        
        lirio.cor = "Branca";
        lirio.aroma = "forte e adocicado";
        lirio.formato = "petalas grandes";
        lirio.petalas = 6;
        
        margarida.cor = "Branco com amarelo";
        margarida.aroma = "leve";
        margarida.formato = "petalas alongadas e retas";
        margarida.petalas = 20;
        
        orquidia.cor = "Variável";
        orquidia.aroma = "adocicado e cítrico";
        orquidia.formato = "assimétrico";
        orquidia.petalas = 6;
        
        jasmim.cor = "Branca";
        jasmim.aroma = "doce e intenso";
        jasmim.formato = "Estrelado";
        jasmim.petalas = 5;
        
        jasmim.soltarPolen();
        
    }
}

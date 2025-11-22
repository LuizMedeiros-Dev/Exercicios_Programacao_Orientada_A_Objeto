/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uec;

/**
 *
 * @author luizf
 */
public class UEC {

    //Meu código
   /* public static void main(String[] args) {
        Lutador l1 = new Lutador();
        Lutador l2 = new Lutador();
        Lutador l3 = new Lutador();
        Lutador l4 = new Lutador();
        Lutador l5 = new Lutador();
        Lutador l6 = new Lutador();
        
        l1.setNome("Pretty Boy");
        l1.setNacionalidade("França");
        l1.setIdade(31);
        l1.setAltura(1.75f);
        l1.setPeso(68.9f);
        l1.setCategoria("Leve");
        l1.setVitorias(11);
        l1.setDerrotas(2);
        l1.setEmpates(1);
        
        l2.setNome("Putscript");
        l2.setNacionalidade("Brasil");
        l2.setIdade(29);
        l2.setAltura(1.68f);
        l2.setPeso(57.8f);
        l2.setCategoria("Leve");
        l2.setVitorias(14);
        l2.setDerrotas(2);
        l2.setEmpates(3);
        
        l3.setNome("Snapshadow");
        l3.setNacionalidade("EUA");
        l3.setIdade(35);
        l3.setAltura(1.65f);
        l3.setPeso(80.9f);
        l3.setCategoria("Médio");
        l3.setVitorias(12);
        l3.setDerrotas(2);
        l3.setEmpates(1);
        
        l4.setNome("Dead Code");
        l4.setNacionalidade("Austrália");
        l4.setIdade(28);
        l4.setAltura(1.93f);
        l4.setPeso(81.6f);
        l4.setCategoria("Médio");
        l4.setVitorias(13);
        l4.setDerrotas(0);
        l4.setEmpates(2);
        
        l5.setNome("Ufocobol");
        l5.setNacionalidade("Brasil");
        l5.setIdade(37);
        l5.setAltura(1.70f);
        l5.setPeso(109.3f);
        l5.setCategoria("Pesado");
        l5.setVitorias(5);
        l5.setDerrotas(4);
        l5.setEmpates(3);
        
        l6.setNome("Nerdaard");
        l6.setNacionalidade("EUA");
        l6.setIdade(30);
        l6.setAltura(1.81f);
        l6.setPeso(105.7f);
        l6.setCategoria("Pesado");
        l6.setVitorias(12);
        l6.setDerrotas(2);
        l6.setEmpates(4);
    }*/
    
    //Código Gustavo Guanabara
    public static void main(String[] args){
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Pretty Boy","França",31,1.75f, 68.9f ,11,2,1);
        l[1] = new Lutador("Putscript","Brasil",29,1.68f, 57.8f ,14,2,3);
        l[2] = new Lutador("Snapshadow","EUA",35,1.65f, 80.9f ,12,2,1);
        l[3] = new Lutador("Dead Code","Austrália",28,1.93f, 81.6f ,13,0,2);
        l[4] = new Lutador("Ufocobol","Brasil",37,1.70f, 119.3f ,5,4,3);
        l[5] = new Lutador("Nerdaart","EUA",30,1.81f, 105.7f ,12,2,4);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        
    }
}

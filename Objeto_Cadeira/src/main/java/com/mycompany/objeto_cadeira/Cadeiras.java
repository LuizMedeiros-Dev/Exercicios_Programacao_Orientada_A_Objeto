
package com.mycompany.objeto_cadeira;

public class Cadeiras {
    String cor;
    String formato;
    float tamanho;
    boolean confortavel;
    
    
    void status(){
    
        System.out.println("Cor " +this.cor);
        System.out.println("FORMATO " +this.formato);
        System.out.println("TAMANAHO " +this.tamanho);
        System.out.println("É confortaável?"+ this.confortavel);
    }
    
    void sentar(){
        
        System.out.println("É macio?");
        
        if(confortavel==true){
            System.out.println("Demais!");
        }
        else{
            System.out.println("Não, cadeira horrível!");
        }
    }
    
    void mover(){
        
        System.out.println("Movendo a cadeira...");
    }
    
    void subir(){
        
        System.out.println("Suba na cadeira, mas tome cuidado!");
        
    }
}

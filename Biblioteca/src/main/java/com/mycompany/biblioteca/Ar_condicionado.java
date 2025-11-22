
package com.mycompany.biblioteca;

public class Ar_condicionado {
    private String cor, modelo;
    private float tamanho;
    private boolean ligado;
    
    public Ar_condicionado(String c, String m, float t, boolean l){
        this.modelo = m;
        this.cor = c;
        this.tamanho = t;
        this.ligado = l;
    }
    
    public String getCor(){
        return cor;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public float getTamanho(){
        return tamanho;
    }
    
    public boolean getLigado(){
        return ligado;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public void setTamanho(float t){
        this.tamanho = t;
    }
    
    public void setLigado(boolean l){
        this.ligado = l;
    }
    
    public void ligado(){
        this.ligado = true;
    }
    
    public void desligado(){
        this.ligado = false;
        
    }
    
    public void status(){
        System.out.println(this.modelo+", "+this.cor+", "+this.tamanho+", "+this.ligado);
    }

   
    
}





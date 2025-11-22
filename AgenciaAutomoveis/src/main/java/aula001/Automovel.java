/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula001;

/**
 *
 * @author luizf
 */
public class Automovel {
    //atributos
    String modelo, cor, tipo, categoria;
    double capacidadePeso;
    int ano, quant, portas;
    boolean estadoMotor = false;
    
    //métodos
    public void ligarMotor(){
        estadoMotor = true;
    }
    
    public void desligarMotor(){
        estadoMotor = false;
    }
    
    public void informarDados(){
        String motorString;
        
        if (estadoMotor){
            motorString = "Ligado";
        }
        else{
            motorString = "Desligado";
        }
        System.out.println("Automóvel"+ modelo+", ano:"+ano+", cor:"+cor+" "+tipo+"\n Motor: "+ motorString+"Categoria: "+categoria+", Capacidade Ton: "+capacidadePeso+"Passageiros: "+quant+"Portas: "+portas+"\n");
        estadoMotor = false;
    }
}

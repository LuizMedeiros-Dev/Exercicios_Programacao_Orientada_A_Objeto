/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ex_Porta_Avioes;

/**
 *
 * @author luizf
 */
public class Porta_Avioes {
     public Porta_Avioes(){
    }
    

    public static void main(String[] args) {
       Aviao a1 = new Aviao();
       Aviao a2 = new Aviao();
       Aviao a3 = new Aviao();
       Aviao a4 = new Aviao();
       Aviao a5 = new Aviao();
       
       a1.classificacao = "Carga Sólida";
       a1.tipoMotor = "Turbina";
       a1.finalidade = "Carga e transporte";
       a1.velocidade = 850;
       
       a2.classificacao = "Abastecimento";
       a2.tipoMotor = "Turbina";
       a2.finalidade = "Abastecimento no ar";
       a2.velocidade = 700;
       
       
       a3.classificacao = "Helicoptero";
       a3.tipoMotor = "Hélice";
       a3.finalidade = "Transporte";
       a3.velocidade = 240;
       
       a4.classificacao = "Caça";
       a4.tipoMotor = "Jato";
       a4.finalidade = "Militar";
       a4.velocidade = 1400;
       
       a5.classificacao = "Reconhecimento";
       a5.tipoMotor = "Jato";
       a5.finalidade = "Militar";
       a5.velocidade = 650;
       
       a2.decolar();
       a5.decolar();
       
       
       
       
    }
}

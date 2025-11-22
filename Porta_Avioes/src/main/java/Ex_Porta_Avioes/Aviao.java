


package Ex_Porta_Avioes;

import javax.swing.JOptionPane;


public class Aviao {
   String classificacao, tipoMotor, finalidade;
   double velocidade;
   boolean decolar;
   
   public void decolar(){
       decolar = true;
       JOptionPane.showMessageDialog(null,"Avião "+classificacao+ " Voando...");
   }
    
    
    
}

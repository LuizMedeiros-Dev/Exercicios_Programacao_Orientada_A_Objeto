
package Ex_floricultura;
import javax.swing.JOptionPane;

public class Flor {
    String cor, formato, aroma;
    int petalas;
    boolean polen;
    
    public void soltarPolen(){
        polen = true;
        JOptionPane.showMessageDialog(null, "Vem tranquilo abelhas...");
    }
 
}

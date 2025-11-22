
package aula001;
import java.awt.*;
import java.awt.event.*;
        
public class J2exe2 extends J2exe1 {
    public J2exe2(){
        setTitle("Segunda Tela");
        Color lightOrage = Color.orange.brighter();
        setBackground(lightOrage);
    }
    
    public static void main(String[] args){
        new J2exe2().setVisible(true);
    }
    
}

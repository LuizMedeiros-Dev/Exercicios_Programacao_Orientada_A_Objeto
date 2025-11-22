
package aula001;
import java.awt.*;
import java.awt.event.*;

public class J2exe3 extends J2exe1 {
    public J2exe3(){
        setTitle("Terceira Tela");
        Color novaCor = new Color(120,200,255);
        setBackground(novaCor);
    }
    
    public static void main(String[] args){
        new J2exe3().setVisible(true);
    }
}

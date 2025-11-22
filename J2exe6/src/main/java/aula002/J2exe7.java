
package aula002;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class J2exe7 extends Frame{
    Dimension dim;
    Image im;
    Label l1;
    Font letra;
    
    public J2exe7(){
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        
        setTitle("Uso da interface WindowListener");
        setResizable(false);
        setSize(dim);
        setLocation(0,0);
        setBackground(Color.lightGray);
        letra = new Font("TimesRoman", Font.PLAIN,19);
        setFont(letra);
        setLayout(null);
        
        l1 = new Label("Este programa fecha a janela");
        l1.setLocation(190,120);
        l1.setSize(450,20);
        add(l1);
        addWindowListener(new FechaJanela());
    }
    
    public static void main(String arg[]){
        new J2exe6().setVisible(true);
    }
}


package Exercicio2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Frame1 extends Frame{
    public Frame1(){
        setTitle("Frame 1");
        Color cor = new Color(22,22,000);
        setBackground(cor);
        setResizable(true);
        setSize(500,500);
        setLocation(500,180);
        addWindowListener(new Escuta());
    }
    
    public static void main(String[] args){
        new Frame1().setVisible(true);
    }
    
    class Escuta implements WindowListener{
        public void windowOpened(WindowEvent e){}
        public void windowClosing(WindowEvent e){JOptionPane.showMessageDialog(null,"Good Bye!");System.exit(0);}
        public void windowClosed(WindowEvent e){}
        public void windowIconified(WindowEvent e){}
        public void windowDeiconified(WindowEvent e){}
        public void windowActivated(WindowEvent e){}
        public void windowDeactivated(WindowEvent e){}        
    }
}



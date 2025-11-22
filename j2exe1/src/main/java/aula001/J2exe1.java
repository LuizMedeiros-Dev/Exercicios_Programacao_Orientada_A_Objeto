/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula001;
import java.awt.*;
import java.awt.event.*;


public class J2exe1 extends Frame{
    public J2exe1(){
        setTitle("Primeira Tela");
        setResizable(true);
        setSize(400,300);
        setLocation(100,100);
        setBackground(Color.blue);
        addWindowListener(new Ouvidoria());
    }
    
    public static void main(String[] args){
        new J2exe1().show();
        new J2exe1().setVisible(true);
    }
    
    class Ouvidoria implements WindowListener{
        public void windowOpened(WindowEvent e){}
        public void windowClosing(WindowEvent e){System.out.println("Good Bye!");System.exit(0);}
        public void windowClosed(WindowEvent e){}
        public void windowIconified(WindowEvent e){}
        public void windowDeiconified(WindowEvent e){}
        public void windowActivated(WindowEvent e){}
        public void windowDeactivated(WindowEvent e){}
        
    }
}




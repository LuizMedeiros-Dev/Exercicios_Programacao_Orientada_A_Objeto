package aula003;

import javax.swing.*;
import java.awt.*;

/*adicionando rótulos, mensagens fixas usaremos o objeto da classe JLabel*/
public class ClasseJLabel extends ClasseJFrame {
    public static JLabel L1, L2, L3;
    public static Font F;

    public ClasseJLabel() {
        super();
        setTitle("Adicionando Rótulos na apresentação");
        setBounds(200, 150, 400, 300);
        Font F = new Font("Sans Serif", Font.PLAIN, 16);
        this.F = F;
        getContentPane().setLayout(null);

        /*
         * setLayout(null) permite simplificar a discussão das propriedades
         * do objeto label, posicionando o label em qualquer lugar
         */

        JLabel L1 = new JLabel();
        this.L1 = L1;
        L1.setText("Este é um rótulo \"JLabel\"");
        L1.setSize(200, 15);
        L1.setFont(F);
        L1.setLocation(105, 5);
        L1.setForeground(Color.blue);

        JLabel L2 = new JLabel();
        this.L2 = L2;
        L2.setText("Este é outro rótulo \"JLabel\"");
        L2.setBounds(105, 65, 200, 15);
        L2.setFont(F);
        L2.setForeground(Color.red);

        JLabel L3 = new JLabel();
        this.L3 = L3;
        L3.setText("Este é outro rótulo \"JLabel\"");
        L3.setSize(200, 15);
        L3.setFont(F);
        L3.setLocation(105, 125);
        L3.setForeground(Color.black);
        
        

        getContentPane().add(L1);
        getContentPane().add(L2);
        getContentPane().add(L3);
        
    }

    public static void main(String Arg[]) {
        ClasseJLabel Ex = new ClasseJLabel();
        Ex.show();
    }
}



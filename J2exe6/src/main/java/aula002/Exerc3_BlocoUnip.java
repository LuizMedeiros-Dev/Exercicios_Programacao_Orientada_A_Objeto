package aula002;

import java.awt.*;
import java.awt.event.*;

public class Exerc3_BlocoUnip extends Frame  {
    public Label L1, L2, L3, L4, L5;
    public Panel P1, P2, P3, P4, P5;
    public Dimension dim;

    public Exerc3_BlocoUnip() {
        dim = new Dimension(400, 300);
        setSize(dim);
        setLocation(150, 150);
        setTitle("Blocos Unip Campus Flamboyant");
        setBackground(Color.black);

        setLayout(new BorderLayout(5,5));

        P1 = new Panel();
        P1.setLayout(new FlowLayout(1));
        P1.setBackground(Color.orange);

        P2 = new Panel();
        P2.setLayout(new FlowLayout(1));
        P2.setBackground(Color.red);

        P3 = new Panel();
        P3.setLayout(new FlowLayout(1));
        P3.setBackground(Color.yellow);

        P4 = new Panel();
        P4.setLayout(new FlowLayout(1));
        P4.setBackground(Color.white);

        P5 = new Panel();
        P5.setLayout(new FlowLayout(1));
        P5.setBackground(Color.lightGray);

        L1 = new Label("Bloco A");
        L1.setBackground(Color.orange);

        L2 = new Label("Bloco B");
        L2.setBackground(Color.red);

        L3 = new Label("Bloco C");
        L3.setBackground(Color.yellow);

        L4 = new Label("Bloco D");
        L4.setBackground(Color.white);

        L5 = new Label("Bloco E");
        L5.setBackground(Color.lightGray);

        P1.add(L1);
        P2.add(L2);
        P3.add(L3);
        P4.add(L4);
        P5.add(L5);

        add(P1, BorderLayout.NORTH);
        add(P2, BorderLayout.WEST);
        add(P3,BorderLayout.EAST);
        add(P4, BorderLayout.CENTER);
        add(P5,BorderLayout.SOUTH);
        addWindowListener(new FechaJanela());
    }

    public static void main(String arg[]) {
        new Exerc3_BlocoUnip().show();
        //new Exerc3_BlocoUnip().setVisible(true);
    }
}

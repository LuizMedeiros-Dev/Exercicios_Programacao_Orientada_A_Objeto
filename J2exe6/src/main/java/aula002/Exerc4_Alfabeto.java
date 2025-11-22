package aula002;

import java.awt.*;
import java.awt.event.*;

public class Exerc4_Alfabeto extends Frame {

    public Button B1, B2, B3, B4, B5, B6, B7, B8, B9, B0, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20, B21, B22,B23,B24,B25,B26,B27,B28,B29,B30;
    public Panel P1;

    public Exerc4_Alfabeto() {

        setSize(600, 200);
        setLocation(150, 150);
        setTitle("LAYOUT TECLADO");
        setResizable(true);
        setBackground(Color.black);

        //setLayout(null);
        P1 = new Panel();
        P1.setSize(100, 100);
        P1.setLocation(20, 20);
        P1.setLayout(new GridLayout(3, 0, 2, 2));
        
        B1 = new Button("Q");
        B1.setBackground(Color.lightGray);
        B2 = new Button("W");
        B2.setBackground(Color.lightGray);
        B3 = new Button("E");
        B3.setBackground(Color.lightGray);
        B4 = new Button("R");
        B4.setBackground(Color.lightGray);
        B5 = new Button("T");
        B5.setBackground(Color.lightGray);
        B6 = new Button("Y");
        B6.setBackground(Color.lightGray);
        B7 = new Button("U");
        B7.setBackground(Color.lightGray);
        B8 = new Button("I");
        B8.setBackground(Color.lightGray);
        B9 = new Button("O");
        B9.setBackground(Color.lightGray);
        B0 = new Button("P");
        B0.setBackground(Color.lightGray);
        B11 = new Button("A");
        B11.setBackground(Color.lightGray);
        B12 = new Button("S");
        B12.setBackground(Color.lightGray);
        B13 = new Button("D");
        B13.setBackground(Color.lightGray);
        B14 = new Button("F");
        B14.setBackground(Color.lightGray);
        B15 = new Button("G");
        B15.setBackground(Color.lightGray);
        B16 = new Button("H");
        B16.setBackground(Color.lightGray);
        B17 = new Button("J");
        B17.setBackground(Color.lightGray);
        B18 = new Button("K");
        B18.setBackground(Color.lightGray);
        B19 = new Button("L");
        B19.setBackground(Color.lightGray);
        B30 = new Button("Ç");
        B30.setBackground(Color.lightGray);
        B20 = new Button("Z");
        B20.setBackground(Color.lightGray);
        B21 = new Button("X");
        B21.setBackground(Color.lightGray);
        B22 = new Button("C");
        B22.setBackground(Color.lightGray);
        B23 = new Button("V");
        B23.setBackground(Color.lightGray);
        B24 = new Button("B");
        B24.setBackground(Color.lightGray);
        B25 = new Button("N");
        B25.setBackground(Color.lightGray);
        B26 = new Button("M");
        B26.setBackground(Color.lightGray);
        B27 = new Button(",");
        B27.setBackground(Color.lightGray);
        B28 = new Button(".");
        B28.setBackground(Color.lightGray);
        B29 = new Button(";");
        B29.setBackground(Color.lightGray);
        

        P1.add(B1);
        P1.add(B2);
        P1.add(B3);
        P1.add(B4);
        P1.add(B5);
        P1.add(B6);
        P1.add(B7);
        P1.add(B8);
        P1.add(B9);
        P1.add(B0);
        P1.add(B11);
        P1.add(B12);
        P1.add(B13);
        P1.add(B14);
        P1.add(B15);
        P1.add(B16);
        P1.add(B17);
        P1.add(B18);
        P1.add(B19);
        P1.add(B30);
        P1.add(B20);
        P1.add(B21);
        P1.add(B22);
        P1.add(B23);
        P1.add(B24);
        P1.add(B25);
        P1.add(B26);
        P1.add(B27);
        P1.add(B28);
        P1.add(B29);
        
        
        

        add(P1);
        addWindowListener(new FechaJanela());
    }
    public static void main(String arg[]) {
        //new Exerc4_Alfabeto().show();
        new Exerc4_Alfabeto().setVisible(true);
    }
}


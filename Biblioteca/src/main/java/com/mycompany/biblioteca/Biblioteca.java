
package com.mycompany.biblioteca;


public class Biblioteca {

    public static void main(String[] args) {
        Ar_condicionado a1 = new Ar_condicionado("Philco", "Branco", 1f, true);
        Ar_condicionado a2 = new Ar_condicionado("Samsung", "Preto", 1.3f, false);
        
        a1.status();
        a2.status();
    }
}

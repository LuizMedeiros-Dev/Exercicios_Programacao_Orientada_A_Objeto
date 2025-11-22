
package com.mycompany.objeto_cadeira;

public class Objeto_Cadeira {

    public static void main(String[] args) {
        Cadeiras cad1 = new Cadeiras();
        cad1.cor = "Cinza";
        cad1.formato = "Formato Padrão";
        cad1.tamanho = 0.30f;
        cad1.confortavel = true;
        cad1.sentar();
        cad1.mover();
        cad1.subir();
        cad1.status();
    }
}

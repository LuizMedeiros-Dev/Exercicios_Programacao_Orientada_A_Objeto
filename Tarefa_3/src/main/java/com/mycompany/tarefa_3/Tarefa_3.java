/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarefa_3;

class Tarefa_3 extends Thread {
    public Tarefa_3(String name) {
        super(name);
    }

    public void run() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Fluxo de programa \" 3\"");
        System.out.println(" ");

        String A = getName();
        System.out.println("Nome da Thread = " + A);
        int b = getPriority();
        System.out.println("Uma Thread de prioridade " + b);
        for (int i = 10; i >= 0; i--) {
            System.out.print("-*");
        }
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Tarefa_3 thread = new Tarefa_3("MinhaThread");
        thread.start(); // Inicia a execução da thread
    }
}

//NÃO FOI DEFINIDO UMA PRIORIDADE,ENTÃO, POR PADRÃO, TEM PRIORIDADE 5.
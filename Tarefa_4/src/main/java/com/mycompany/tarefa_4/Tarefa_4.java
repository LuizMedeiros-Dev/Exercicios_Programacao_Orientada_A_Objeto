/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarefa_4;

class Tarefa_4 extends Thread {
    public Tarefa_4(String name) {
        super(name);
    }

    public void run() {
        System.out.println("\n\nFluxo de programa \"4\"\n");

        String nome = getName();
        System.out.println("Nome da Thread = " + nome);

        int prioridade = getPriority();
        System.out.println("Uma Thread de prioridade " + prioridade);

        for (int i = 10; i >= 0; i--) {
            System.out.print("=*");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Tarefa_4 thread = new Tarefa_4("Thread4");
        thread.setPriority(6); // define a prioridade 6
        thread.start();
    }
}

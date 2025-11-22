/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula004;


class Tarefa_4 extends Thread {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Executando Tarefa_4");
            try {
                Thread.sleep(1000); 
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

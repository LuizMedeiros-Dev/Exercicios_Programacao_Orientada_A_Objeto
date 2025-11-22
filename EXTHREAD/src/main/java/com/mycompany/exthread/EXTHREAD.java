/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exthread;

public class EXTHREAD{
    class Tarefa_1 extends Thread{

	public Tarefa_1(String name){
		super(name);
                //super() serve para chamar o construtor da superclasse. Ele sempre é chamado, 
                //mesmo quando não está explícito no código.
                //Quando for explicitado, deve ser o primeiro item dentro do construtor
	}
	public void run(){
                //run() serve para confirmar a classe Thread que vai ser executada.
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.print("Fluxo de programa \"1\"");
		System.out.println(" ");
		try
		{
			Thread.sleep(5000);//tempo em milissegundos de interrupção
                        // o método sleep() deve sempre ser chamado dentro da estrutura
                        // try-catch, pois a thread que tenta interromper pode estar
                        //paralisada pelo sistema operacional ou outro fluxo do
                        //sistema. No JAVA é lançado uma exceção chamada InterruptedException
		}
		catch(InterruptedException e)
		{
		}
		String A = getName();// serve para imprimir seu próprio nome
		System.out.println("Nome da Thread = "+A);
		int b = getPriority(); // mostra seu grau de prioridade
		System.out.println("Uma Thread de prioridade "+b);
	
		for(int i=0;i<=10;i++)
		{
			System.out.print("-"+i);
		}
		System.out.println(" ");
		System.out.println(" ");
	}
    }
}


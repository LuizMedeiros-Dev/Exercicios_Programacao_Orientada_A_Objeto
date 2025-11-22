/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula004;

class Tarefa_3 extends Thread
{
	public Tarefa_3(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println(" ");
		System.out.println(" ");
		System.out.print("Fluxo de programa \" 3\"");
		System.out.println(" ");


		String A = getName();
		System.out.println("Nome da Thread = "+A);
		int b = getPriority();
		System.out.println("Uma Thread de prioridade "+b); 
		for(int i=20;i>=10;i--)
		{
			System.out.print("-*");
		}
		System.out.println(" ");
		System.out.println(" ");
	}	
}


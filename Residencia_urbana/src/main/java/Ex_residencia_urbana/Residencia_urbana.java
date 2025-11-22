

package Ex_residencia_urbana;


public class Residencia_urbana {

    public static void main(String[] args) {
        Moradia c1 = new Moradia();
        Moradia c2 = new Moradia();
        Moradia c3 = new Moradia();
        Moradia c4 = new Moradia();
        Moradia c5 = new Moradia();
        Moradia c6 = new Moradia();
        
        c1.tipo = "Apartamento 2Q";
        c1.area = 45;
        c1.preco = 100000.00;
        c1.status = "Vendido";
        
        c2.tipo = "Apartamento 3Q";
        c2.area = 50;
        c2.preco = 150000.00;
        c2.status = "À venda";
        
        c3.tipo = "Casa 2Q";
        c3.area = 1000;
        c3.preco = 10000000.00;
        c3.status = "À venda";
        
        c4.tipo = "Casa 3Q";
        c4.area = 20;
        c4.preco = 800.00;
        c4.status = "Disponível Aluguel";
        
        c5.tipo = "Casa 3Q";
        c5.area = 300;
        c5.preco = 5000.00;
        c5.status = "Alugado";
        
        c1.informacoes();
        c2.informacoes();
        c3.informacoes();
        c4.informacoes();
        c5.informacoes();
       
        c2.construcao();
        c3.construcao();
    }
}

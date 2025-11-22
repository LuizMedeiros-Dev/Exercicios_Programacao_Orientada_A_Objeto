package Ex_Moradia;

public class Moradia {

    public static void main(String[] args) {
        Casa c1 = new Casa();
        Casa c2 = new Casa();
        Casa c3 = new Casa();
        Casa c4 = new Casa();
        Casa c5 = new Casa();
        Casa c6 = new Casa();
        
        c1.tipo = "Apartamento";
        c1.area = 45;
        c1.quartos = 2;
        c1.preco = 100000.00;
        c1.status = "Vendido";
        
        c2.tipo = "Casa";
        c2.area = 50;
        c2.quartos = 3;
        c2.preco = 150000.00;
        c2.status = "À venda";
        
        c3.tipo = "Mansão";
        c3.area = 1000;
        c3.quartos = 25;
        c3.preco = 10000000.00;
        c3.status = "À venda";
        
        c4.tipo = "kitnet";
        c4.area = 20;
        c4.quartos = 1;
        c4.preco = 800.00;
        c4.status = "Disponível Aluguel";
        
        c5.tipo = "Cobertura";
        c5.area = 300;
        c5.quartos = 3;
        c5.preco = 5000.00;
        c5.status = "Alugado";
        
        c6.tipo = "Duplex";
        c6.area = 150;
        c6.quartos = 5;
        c6.preco = 450000.00;
        c6.status = "Leiloado";
        
        c1.informacoes();
        c2.informacoes();
        c3.informacoes();
        c4.informacoes();
        c5.informacoes();
        c6.informacoes();
        
        
    }
}
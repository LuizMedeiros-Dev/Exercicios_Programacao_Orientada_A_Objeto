/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula001;

/**
 *
 * @author luizf
 */
public class AgenciaAutomoveis {
    public AgenciaAutomoveis(){
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Criando os objetos
        Automovel fusca = new Automovel();
        Automovel gol = new Automovel();
        Automovel monza = new Automovel();
        Automovel montana = new Automovel();
        
        fusca.modelo = "fusca";
        fusca.cor = "Preto";
        fusca.ano = 1977;
        fusca.tipo = "luxo";
        fusca.categoria = "passeio";
        fusca.capacidadePeso = 0.38;
        fusca.quant = 5;
        fusca.portas = 2;
        
        gol.modelo = "gol";
        gol.cor = "Prata";
        gol.ano = 2001;
        gol.tipo = "Simples";
        gol.categoria = "Passeio";
        gol.capacidadePeso = 0.4;
        gol.quant = 5;
        gol.portas = 4;
        
        monza.modelo = "Monza";
        monza.cor = "Vermelho";
        monza.ano = 1994;
        monza.tipo = "Confort";
        monza.categoria = "Passeio";
        monza.capacidadePeso = 1.1;
        monza.quant = 5;
        monza.portas = 4;        
        
        montana.modelo = "Montana";
        montana.cor = "Azul";
        montana.ano = 2004;
        montana.tipo = "Luxo";
        montana.categoria = "Utilitário";
        montana.capacidadePeso = 0.75;
        montana.quant = 5;
        montana.portas = 4;
        
        //Ligando motores
        fusca.ligarMotor();
        gol.ligarMotor();
        monza.ligarMotor();
        montana.ligarMotor();
        
        //informações dos automoveis
        fusca.informarDados();
        gol.informarDados();
        monza.informarDados();
        montana.informarDados();
        
        fusca.desligarMotor();
        monza.desligarMotor();
    }
}

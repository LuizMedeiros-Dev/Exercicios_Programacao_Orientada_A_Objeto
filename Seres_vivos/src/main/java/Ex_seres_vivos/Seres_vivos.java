

package Ex_seres_vivos;

public class Seres_vivos {

    public static void main(String[] args) {
        Tipos_de_pessoa mulher = new Tipos_de_pessoa();
        Tipos_de_pessoa homem = new Tipos_de_pessoa();
        
        mulher.sexo = "Femino";
        mulher.cromossomo = "XY";
        mulher.hormonio = "Estrogenio";
        mulher.forca = "Pouca força";
        mulher.voz = "Fina e doce";
        
        homem.sexo = "Masculino";
        homem.cromossomo = "XX";
        homem.hormonio = "Testosterona";
        homem.forca = "Muita força";
        homem.voz = "Grossa e imponente";
        
        mulher.caracteristicas();
        homem.caracteristicas();
        
    }
}

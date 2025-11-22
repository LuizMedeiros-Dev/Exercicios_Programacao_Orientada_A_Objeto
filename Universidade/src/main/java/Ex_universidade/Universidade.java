package Ex_universidade;


public class Universidade {

    public static void main(String[] args) {
        Curso Ciencia_da_computacao = new Curso();
        Curso Administracao = new Curso();
        Curso Direito = new Curso();
        
        Ciencia_da_computacao.nome = "Ciência da Computação";
        Ciencia_da_computacao.area = "Exatas";
        Ciencia_da_computacao.horario = "Noturno";
        Ciencia_da_computacao.periodos = 8;
        Ciencia_da_computacao.vagas = 15;
        
        Administracao.nome = "Administração";
        Administracao.area = "Ciencias sociais";
        Administracao.horario = "Vespertino";
        Administracao.periodos = 8;
        Administracao.vagas = 17;
        
        Direito.nome = "Direito";
        Direito.area = "Ciencias sociais";
        Direito.horario = "Matutino";
        Direito.periodos = 8;
        Direito.vagas = 5;
        
        Direito.pos();
        Administracao.pos();
    }
}

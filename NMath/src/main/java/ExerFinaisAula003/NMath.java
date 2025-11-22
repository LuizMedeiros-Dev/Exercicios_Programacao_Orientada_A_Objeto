

package ExerFinaisAula003;

public class NMath {

    // Questão 1: conversão moeda
    public static double euroParaReal(double euro, double cotacao) {
        return euro * cotacao;
    }

    public static double realParaEuro(double real, double cotacao) {
        return real / cotacao;
    }

    // Questão 2: áreas
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double areaQuadrado(double lado) {
        return lado * lado;
    }

    public static double areaRetangulo(double base, double altura) {
        return base * altura;
    }

    // Questão 3: notas
    public static double calcularNota(double np1, double pii, double np2) {
        return ((np1 * 3) + (pii * 4) + (np2 * 3)) / 10;
    }

    public static double calcularNotaFinal(double nota, double exame) {
        return (nota + exame) / 2;
    }
}

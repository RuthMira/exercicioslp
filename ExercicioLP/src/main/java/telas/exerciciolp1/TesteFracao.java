package telas.exerciciolp1;

public class TesteFracao {
    public static void main(String[] args) {
        // Criando duas frações para teste
        Fracao frac1 = new Fracao(3, 4);
        Fracao frac2 = new Fracao(1, 2);

        // Realizando operações com as frações
        Fracao soma = frac1.somar(frac2);
        Fracao subtracao = frac1.subtrair(frac2);
        Fracao multiplicacao = frac1.multiplicar(frac2);
        Fracao divisao = frac1.dividir(frac2);

        // Exibindo os resultados
        System.out.println("Soma: " + soma); // Deve imprimir "Soma: 5/4"
        System.out.println("Subtração: " + subtracao); // Deve imprimir "Subtração: 1/4"
        System.out.println("Multiplicação: " + multiplicacao); // Deve imprimir "Multiplicação: 3/8"
        System.out.println("Divisão: " + divisao); // Deve imprimir "Divisão: 3/2"
    }
}

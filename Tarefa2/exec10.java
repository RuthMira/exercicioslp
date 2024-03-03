//  Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada. 

import java.util.Scanner;

public class exec10 {
    public static void main(String[] args) {
        // Cria um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a nota da 1ª avaliação
        System.out.print("Digite a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();

        // Solicita a nota da 2ª avaliação
        System.out.print("Digite a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();

        // Calcula a média aritmética simples
        double media = (nota1 + nota2) / 2;

        // Exibe a média calculada
        System.out.println("Média: " + media);

        // Verifica se o aluno foi aprovado
        if (media >= 6.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }

        // Fecha o Scanner
        scanner.close();
    }
}

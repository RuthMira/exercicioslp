// As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. 

import java.util.Scanner;

public class exec9 {
    public static void main(String[] args) {
        // Cria um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o número de maçãs compradas
        System.out.print("Digite o número de maçãs compradas: ");
        int quantidadeMacas = scanner.nextInt();

        // Calcula o custo total com base na quantidade de maçãs
        double custoTotal = 0.0;
        if (quantidadeMacas < 12) {
            custoTotal = quantidadeMacas * 1.30;
        } else {
            custoTotal = quantidadeMacas * 1.00;
        }

        // Exibe o custo total da compra
        System.out.println("O custo total da compra é: R$ " + custoTotal);

        // Fecha o Scanner
        scanner.close();
    }
}

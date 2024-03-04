//  Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. 
import java.util.Scanner;

public class exec12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite outro número (diferente do primeiro): ");
        double num2 = scanner.nextDouble();

        scanner.close();

        // Verificar se os números são diferentes
        if (num1 != num2) {
            // Verificar qual número é maior
            if (num1 > num2) {
                System.out.println("O número maior é: " + num1);
            } else {
                System.out.println("O número maior é: " + num2);
            }
        } else {
            System.out.println("Os números são iguais. Por favor, insira valores diferentes.");
        }
    }
}


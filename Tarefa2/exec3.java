//  Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário. 
import java.util.Scanner;

public class exec3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do salário anual?");
        double salarioAnual = scanner.nextDouble();

        System.out.println("Qual o valor do reajuste em porcentagem?");
        double reajustePercentual = scanner.nextDouble();

        scanner.close();

        // Calcular o reajuste
        double reajusteDecimal = reajustePercentual / 100.0;
        double salarioFinal = salarioAnual * (1 + reajusteDecimal);

        // Exibir o resultado
        System.out.println("O novo salário após o reajuste é: " + salarioFinal);
    }
}


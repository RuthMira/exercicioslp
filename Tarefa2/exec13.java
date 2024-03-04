// Letr dois números (considere que sejam diferentes), e retornar em ordem crescente
import java.util.Scanner;

public class exec13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        double num2 = scanner.nextDouble();

        scanner.close();

        // Verificar qual número é maior
        if (num1 > num2) {
            System.out.println("Os números em ordem crescente são: " + num2 + " " + num1);
        } else {
            System.out.println("Os números em ordem crescente são: " + num1 + " " + num2);
        }
    }
}

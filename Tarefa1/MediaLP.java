import java.util.Scanner;

public class MediaLP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir os valores das variáveis
        System.out.print("Digite o valor de P1: ");
        double P1 = scanner.nextDouble();

        System.out.print("Digite o valor de E1: ");
        double E1 = scanner.nextDouble();

        System.out.print("Digite o valor de E2: ");
        double E2 = scanner.nextDouble();

        System.out.print("Digite o valor de API: ");
        double API = scanner.nextDouble();

        System.out.print("Digite o valor de X: ");
        double X = scanner.nextDouble();

        System.out.print("Digite o valor de SUB: ");
        double SUB = scanner.nextDouble();

        scanner.close();

        // Calcula a expressão
        double mediaProvas = (P1 * 0.6 + ((E1 + E2) / 2) * 0.4);
        double extra = (API + mediaProvas > 10) ? 0 : Math.max((mediaProvas - 5.9), 0) / (5.9 - mediaProvas);
        
        double resultado = (mediaProvas * 0.5 + extra) * (API * 0.5) + X + (SUB * 0.2);        

        // Imprime o resultado
        System.out.println("O resultado da expressão é: " + resultado);
    }
}

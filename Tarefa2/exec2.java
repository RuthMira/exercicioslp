// Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. 
import java.util.Scanner;

public class exec2 {
    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número total de eleitores
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        // Solicitar o número de votos brancos
        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        // Solicitar o número de votos nulos
        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        // Solicitar o número de votos válidos
        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();

        // Calcular as porcentagens
        double percentualBrancos = calcularPercentual(votosBrancos, totalEleitores);
        double percentualNulos = calcularPercentual(votosNulos, totalEleitores);
        double percentualValidos = calcularPercentual(votosValidos, totalEleitores);

        // Exibir os resultados
        System.out.println("Resultados da Eleição:");
        System.out.println("Votos Brancos: " + percentualBrancos + "%");
        System.out.println("Votos Nulos: " + percentualNulos + "%");
        System.out.println("Votos Válidos: " + percentualValidos + "%");
    }

    // Função para calcular a porcentagem
    public static double calcularPercentual(int votos, int totalEleitores) {
        if (totalEleitores > 0) {
            return (votos * 100.0) / totalEleitores;
        } else {
            return 0.0; // Evitar divisão por zero
        }
    }
}

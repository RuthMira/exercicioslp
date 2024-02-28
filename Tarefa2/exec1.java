
// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
import java.util.Scanner;

public class exec1 {
    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar a idade em anos, meses e dias
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();

        // Calcular a idade total em dias
        int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);

        // Exibir o resultado
        System.out.println("A idade em dias é: " + idadeEmDias + " dias");
    }

    // Função para calcular a idade total em dias
    public static int calcularIdadeEmDias(int anos, int meses, int dias) {
        // Considerando um ano com 365 dias
        int idadeEmDias = anos * 365;

        // Adicionar os dias correspondentes aos meses
        idadeEmDias += meses * 30; // Usando uma aproximação para meses

        // Adicionar os dias adicionais
        idadeEmDias += dias;

        return idadeEmDias;
    }
}


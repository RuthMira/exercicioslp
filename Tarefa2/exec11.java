// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
import java.util.Scanner;

public class exec11 {
    public static void main(String[] args) {
        // Criar um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.println("Digite o ano do seu nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();

        int idade = anoAtual - anoNascimento;

        // Verificar se a pessoa pode votar
        if (idade >= 16) {
            System.out.println("Você pode votar este ano!");
        } else {
            System.out.println("Você não pode votar este ano.");
        }
    }
}


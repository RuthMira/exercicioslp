//  Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F

import java.util.Scanner;

public class exec6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Fahrenheit:");
        double temperaturaFahrenheit = scanner.nextDouble();

        scanner.close();

        // Calcular a temperatura em graus Celsius
        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;

        // Exibir o resultado
        System.out.println("A temperatura em graus Celsius é: " + temperaturaCelsius);
    }
}

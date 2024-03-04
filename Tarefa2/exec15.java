// A jornada semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo o calculo é o valor da hora regular mais um acréscimo de 50%. Escreva um algoritimo que leia a quantidade de horas trabalhadas de um funcionário no mês, o salário por hora , e escreva o salário total do funcionártio que deverá ser acrescido das horas extras, caso haja. (considere que o mês tem 4 semnaas exatas).

import java.util.Scanner;

public class exec15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da quantidade de horas trabalhadas no mês e salário por hora
        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.println("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        scanner.close();

        // Definindo a jornada semanal e o número de semanas no mês
        int jornadaSemanal = 40;
        int semanasNoMes = 4;

        // Calculando as horas extras
        double horasExtras = Math.max(0, horasTrabalhadas - (jornadaSemanal * semanasNoMes));

        // Calculando o salário total
        double salarioTotal = (jornadaSemanal * semanasNoMes * salarioPorHora) + (horasExtras * 1.5 * salarioPorHora);

        System.out.println("O salário total do funcionário é: " + salarioTotal);
    }
}

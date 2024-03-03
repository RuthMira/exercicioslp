// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.
import java.util.Scanner;

public class exec5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de carros vendidos:");
        int numCarrosVendidos = scanner.nextInt();

        System.out.println("Digite o valor total das vendas:");
        double valorTotalVendas = scanner.nextDouble();

        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o valor que o vendedor recebe por carro vendido:");
        double comissaoPorCarro = scanner.nextDouble();

        scanner.close();

        // Calcular a comissão (5% do valor total de vendas)
        double comissaoPorVendas = 0.05 * valorTotalVendas;

        // Calcular o salário final do vendedor
        double salarioFinal = salarioFixo + (numCarrosVendidos * comissaoPorCarro) + comissaoPorVendas;

        // Exibir o resultado
        System.out.println("O salário final do vendedor é: " + salarioFinal);
    }
}


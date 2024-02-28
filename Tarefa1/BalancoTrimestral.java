public class BalancoTrimestral {
    public static void main(String[] args) {
        // Gastos de cada mês
        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;

        // Calcula a despesa total no trimestre
        int despesaTotal = gastoJaneiro + gastoFevereiro + gastoMarco;

        // Calcula a média mensal de gastos
        double mediaMensal = despesaTotal / 3.0;

        // Imprime os resultados
        System.out.println("Despesa total no trimestre: R$" + despesaTotal);
        System.out.println("Média mensal de gastos: R$" + mediaMensal);
    }
}

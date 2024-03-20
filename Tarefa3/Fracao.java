import java.util.Objects;

public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero");
        }
        int mdcComum = gcd(numerador, denominador);
        this.numerador = numerador / mdcComum;
        this.denominador = denominador / mdcComum;
    }

    public Fracao somar(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador + outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao subtrair(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador - outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao multiplicar(Fracao outra) {
        int novoNumerador = this.numerador * outra.numerador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao dividir(Fracao outra) {
        if (outra.numerador == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        int novoNumerador = this.numerador * outra.denominador;
        int novoDenominador = this.denominador * outra.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fracao fracao = (Fracao) o;
        return numerador == fracao.numerador && denominador == fracao.denominador;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerador, denominador);
    }

    public static void main(String[] args) {
        Fracao frac1 = new Fracao(3, 4);
        Fracao frac2 = new Fracao(1, 2);

        Fracao soma = frac1.somar(frac2);
        Fracao subtracao = frac1.subtrair(frac2);
        Fracao multiplicacao = frac1.multiplicar(frac2);
        Fracao divisao = frac1.dividir(frac2);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}

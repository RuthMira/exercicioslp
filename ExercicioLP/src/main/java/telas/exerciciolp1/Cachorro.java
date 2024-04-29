package telas.exerciciolp1;

public class Cachorro {
    private String raca;
    private int numeroPatas;
    private String corDoPelo;

    public String getRaca() {
        return raca;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public String latir(int vezes) {
        return "\n" + "O cachorro latiu " + vezes + " vezes.";
    }

    public void rosnar() {
        System.out.println("O cachorro está rosnando.");
    }

    public void brincar() {
        System.out.println("O cachorro está brincando com sua coleira.");
    }

    public void comer(String comida) {
        System.out.println("O cachorro está comendo " + comida + ".");
    }
}

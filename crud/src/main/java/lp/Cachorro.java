package lp;

public class Cachorro {
    private int id;
    private String raca;
    private int numeroPatas;
    private String corDoPelo;

    public Cachorro() {
    }

    public Cachorro(int id, String raca, int numeroPatas, String corDoPelo) {
        this.id = id;
        this.raca = raca;
        this.numeroPatas = numeroPatas;
        this.corDoPelo = corDoPelo;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getCorDoPelo() {
        return corDoPelo;
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

public class Passaro {
    // Atributos
    private String nome;
    private String cor;
    private double peso;

    // Construtor
    public Passaro(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    // Métodos
    // Método para o pássaro voar
    public void voar() {
        System.out.println(nome + " está voando.");
    }

    // Método para o pássaro comer
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    // Método para o pássaro cantar
    public void cantar() {
        System.out.println(nome + " está cantando.");
    }

    // Getters e Setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}


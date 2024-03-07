public class Caderno {
    // Atributos
    private String cor;
    private double peso;
    private String tamanho;

    // Construtor
    public Caderno(String cor, double peso, String tamanho) {
        this.cor = cor;
        this.peso = peso;
        this.tamanho = tamanho;
    }

    // Métodos
    // Método para escrever no caderno
    public void escrever() {
        System.out.println("Escrevendo no caderno de cor " + cor);
    }

    // Método para molhar o caderno
    public void molhar() {
        System.out.println("Molhando o caderno de tamanho " + tamanho);
    }

    // Método para desenhar no caderno
    public void desenhar() {
        System.out.println("Desenhando no caderno de peso " + peso);
    }

    // Getters e Setters para os atributos
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

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}

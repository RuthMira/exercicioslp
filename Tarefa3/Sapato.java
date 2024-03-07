public class Sapato {
    // Atributos
    private String marca;
    private int tamanho;
    private String cor;

    // Construtor
    public Sapato(String marca, int tamanho, String cor) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    // Métodos
    // Método para usar o sapato
    public void usar() {
        System.out.println("Usando sapato da marca " + marca + ", tamanho " + tamanho + ", cor " + cor + ".");
    }

    // Método para guardar o sapato
    public void guardar() {
        System.out.println("Guardando sapato da marca " + marca + ", tamanho " + tamanho + ", cor " + cor + ".");
    }

    // Método para verificar a disponibilidade do sapato em um determinado tamanho
    public boolean verificarDisponibilidade(int tamanhoDesejado) {
        return tamanho == tamanhoDesejado;
    }

    // Getters e Setters para os atributos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

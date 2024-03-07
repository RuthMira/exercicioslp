public class Carro {
    // Atributos
    private String cor;
    private String modelo;
    private String tamanho;

    // Construtor
    public Carro(String cor, String modelo, String tamanho) {
        this.cor = cor;
        this.modelo = modelo;
        this.tamanho = tamanho;
    }

    // Métodos
    // Método para o carro correr
    public void correr() {
        System.out.println("O carro está correndo a toda velocidade.");
    }

    // Método para o carro flutuar
    public void flutuar() {
        System.out.println("O carro está flutuando sobre a superfície.");
    }

    // Método para o carro carregar peso
    public void carregarPeso() {
        System.out.println("O carro está carregando peso adicional.");
    }

    // Getters e Setters para os atributos
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}

public class Flor {
    // Atributos
    private String cor;
    private String tamanho;
    private String especie;

    // Construtor
    public Flor(String cor, String tamanho, String especie) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.especie = especie;
    }

    // Métodos
    // Método para a flor apodrecer
    public void apodrecer() {
        System.out.println("A flor está apodrecendo. Remova-a para manter o ambiente limpo.");
    }

    // Método para a flor crescer
    public void crescer() {
        System.out.println("A flor está crescendo. Admire sua beleza.");
    }

    // Método para a flor morrer
    public void morrer() {
        System.out.println("A flor morreu. Remova-a para permitir o crescimento de novas plantas.");
    }

    // Getters e Setters para os atributos
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}

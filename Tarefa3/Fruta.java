public class Fruta {
    // Atributos
    private String tamanho;
    private String cor;
    private String sabor;

    // Construtor
    public Fruta(String tamanho, String cor, String sabor) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.sabor = sabor;
    }

    // Métodos
    // Método para comer a fruta
    public void comer() {
        System.out.println("Comendo a fruta. Sabor: " + sabor);
    }

    // Método para a fruta apodrecer
    public void apodrecer() {
        System.out.println("A fruta está apodrecendo. Descarte-a adequadamente.");
    }

    // Método para a fruta crescer
    public void crescer() {
        System.out.println("A fruta está crescendo. Aguarde o tempo necessário para colher.");
    }

    // Getters e Setters para os atributos
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}

public class Cachorro {
    // Atributos
    private String corDoPelo;
    private String tamanho;
    private int idade;

    // Construtor
    public Cachorro(String corDoPelo, String tamanho, int idade) {
        this.corDoPelo = corDoPelo;
        this.tamanho = tamanho;
        this.idade = idade;
    }

    // Métodos
    // Método para o cachorro correr
    public void correr() {
        System.out.println("O cachorro está correndo alegremente.");
    }

    // Método para o cachorro dormir
    public void dormir() {
        System.out.println("O cachorro está dormindo tranquilamente.");
    }

    // Método para o cachorro morder
    public void morder() {
        System.out.println("O cachorro está mordendo um brinquedo.");
    }

    // Getters e Setters para os atributos
    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

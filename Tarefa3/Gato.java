public class Gato {
    // Atributos
    private String corDosOlhos;
    private String texturaDoPelo;
    private String nome;

    // Construtor
    public Gato(String corDosOlhos, String texturaDoPelo, String nome) {
        this.corDosOlhos = corDosOlhos;
        this.texturaDoPelo = texturaDoPelo;
        this.nome = nome;
    }

    // Métodos
    // Método para o gato miar
    public void miar() {
        System.out.println(nome + " está miando.");
    }

    // Método para o gato morder
    public void morder() {
        System.out.println(nome + " está mordendo.");
    }

    // Método para o gato dormir
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    // Getters e Setters para os atributos
    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public String getTexturaDoPelo() {
        return texturaDoPelo;
    }

    public void setTexturaDoPelo(String texturaDoPelo) {
        this.texturaDoPelo = texturaDoPelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

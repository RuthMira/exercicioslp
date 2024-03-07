public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private double altura;

    // Construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Métodos
    // Método para a pessoa falar
    public void falar() {
        System.out.println(nome + " está falando.");
    }

    // Método para a pessoa sorrir
    public void sorrir() {
        System.out.println(nome + " está sorrindo.");
    }

    // Método para a pessoa chorar
    public void chorar() {
        System.out.println(nome + " está chorando.");
    }

    // Getters e Setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}


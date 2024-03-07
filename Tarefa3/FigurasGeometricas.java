public class FigurasGeometricas {
    // Atributos
    private String nome;
    private int lados;
    private double raio;

    // Construtor
    public FigurasGeometricas(String nome, int lados, double raio) {
        this.nome = nome;
        this.lados = lados;
        this.raio = raio;
    }

    // Métodos
    // Método para representar uma figura circular
    public void circular() {
        System.out.println("Desenhando uma figura circular com raio " + raio);
    }

    // Método para representar uma figura retangular
    public void retangular() {
        System.out.println("Desenhando uma figura retangular com " + lados + " lados");
    }

    // Método para perfurar a figura
    public void perfurar() {
        System.out.println("Perfurando a figura " + nome);
    }

    // Getters e Setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

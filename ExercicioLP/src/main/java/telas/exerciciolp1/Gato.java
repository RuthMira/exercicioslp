package telas.exerciciolp1;

public class Gato {
    private static int count = 0;
    private int id;
    private String corPelagem;
    private String padrãoPelagem;
    private String nome;

    public Gato() {
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public String getCorPelagem() {
        return corPelagem;
    }

    public String getPadraoPelagem() {
        return padrãoPelagem;
    }

    public String getNome() {
        return nome;
    }

    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }

    public void setPadraoPelagem(String padrãoPelagem) {
        this.padrãoPelagem = padrãoPelagem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String arranhar() {
        return nome + " está arranhando o sofá.";
    }

    public void brincar() {
        System.out.println(nome + " está brincando com um novelo de lã.");
    }

    public void cochilar() {
        System.out.println(nome + " está cochilando no sol.");
    }

    public boolean éDoméstico(boolean doméstico) {
        return doméstico;
    }

    public void add(Gato gato) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}

package telas.exerciciolp1;

public class Flor {
    private static int count = 0;
    private int id;
    private String tipo;
    private String cor;
    private String localizacao;

    public Flor() {
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String murchar() {
        return "A flor está murchando. Regue-a para mantê-la viva.";
    }

    public void desabrochar() {
        System.out.println("A flor está desabrochando. Observe sua beleza.");
    }

    public void cortar() {
        System.out.println("A flor foi cortada. Coloque-a em um vaso para decorar sua casa.");
    }

    public boolean precisaSol(boolean sol) {
        if (sol) {
            return true;
        } else {
            return false;
        }
    }
}

package telas.exerciciolp1;

public class TestaFlor {
    public static void main(String[] args) {
        Flor flor = new Flor();

        // Definindo as propriedades da flor
        flor.setTipo("Rosa");
        flor.setCor("Vermelha");
        flor.setLocalizacao("Jardim");

        // Exibindo informações sobre a flor
        System.out.println("\n" + "Tipo: " + flor.getTipo());
        System.out.println("Cor: " + flor.getCor());
        System.out.println("Localização: " + flor.getLocalizacao());

        // Realizando ações com a flor
        System.out.println(flor.murchar());
        flor.desabrochar();
        flor.cortar();
        System.out.println("Precisa de sol? " + flor.precisaSol(true) + "\n");
    }
}

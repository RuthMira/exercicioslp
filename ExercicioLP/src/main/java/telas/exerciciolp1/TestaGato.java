package telas.exerciciolp1;

public class TestaGato {
    public static void main(String[] args) {
        Gato gato = new Gato();

        // Definindo as propriedades do gato
        gato.setNome("Bolinha");
        gato.setCorPelagem("Cinza");
        gato.setPadraoPelagem("Listrado");

        // Exibindo informações sobre o gato
        System.out.println("\n" + "Nome: " + gato.getNome());
        System.out.println("Cor da Pelagem: " + gato.getCorPelagem());
        System.out.println("Padrão da Pelagem: " + gato.getPadraoPelagem());

        // Realizando ações com o gato
        System.out.println(gato.arranhar());
        gato.brincar();
        gato.cochilar();
        System.out.println("É doméstico? " + gato.éDoméstico(true) + "\n");
    }
}

package telas.exerciciolp1;

public class TestaCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        // Definindo as propriedades do cachorro
        cachorro.setRaca("Labrador");
        cachorro.setNumeroPatas(4);
        cachorro.setCorDoPelo("Dourado");

        // Exibindo informações sobre o cachorro
        System.out.println("\n" + "Raça: " + cachorro.getRaca());
        System.out.println("Número de Patas: " + cachorro.getNumeroPatas());
        System.out.println("Cor do Pelo: " + cachorro.getCorDoPelo());

        // Realizando ações com o cachorro
        System.out.println(cachorro.latir(3));
        cachorro.rosnar();
        cachorro.brincar();
        cachorro.comer("ração");
    }
}

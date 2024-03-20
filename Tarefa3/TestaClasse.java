public class TestaClasse {

    public static void main(String[] args) {
        // Criando um objeto da classe Cachorro
        Cachorro meuCachorro = new Cachorro("Marrom", "Médio", 3);

        System.out.println("Informações do cachorro:");
        System.out.println("Cor do pelo: " + meuCachorro.getCorDoPelo());
        System.out.println("Tamanho: " + meuCachorro.getTamanho());
        System.out.println("Idade: " + meuCachorro.getIdade());

        meuCachorro.correr();
        meuCachorro.dormir();
        meuCachorro.morder();

        meuCachorro.setCorDoPelo("Preto");
        meuCachorro.setTamanho("Grande");
        meuCachorro.setIdade(5);

        System.out.println("\nInformações atualizadas do cachorro:");
        System.out.println("Cor do pelo: " + meuCachorro.getCorDoPelo());
        System.out.println("Tamanho: " + meuCachorro.getTamanho());
        System.out.println("Idade: " + meuCachorro.getIdade());

        // Criando um objeto da classe Caderno
        Caderno meuCaderno = new Caderno("Azul", 0.5, "A5");

        System.out.println("\nInformações do caderno:");
        System.out.println("Cor: " + meuCaderno.getCor());
        System.out.println("Peso: " + meuCaderno.getPeso());
        System.out.println("Tamanho: " + meuCaderno.getTamanho());

        meuCaderno.escrever();
        meuCaderno.molhar();
        meuCaderno.desenhar();

        meuCaderno.setCor("Vermelho");
        meuCaderno.setPeso(0.8);
        meuCaderno.setTamanho("A4");

        System.out.println("\nInformações atualizadas do caderno:");
        System.out.println("Cor: " + meuCaderno.getCor());
        System.out.println("Peso: " + meuCaderno.getPeso());
        System.out.println("Tamanho: " + meuCaderno.getTamanho());

        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro("verde", "ModeloX", "Grande");

        System.out.println("\nInformações do carro:");
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Tamanho: " + meuCarro.getTamanho());

        meuCarro.correr();
        meuCarro.flutuar();
        meuCarro.carregarPeso();

        meuCarro.setCor("Azul");
        meuCarro.setModelo("ModeloY");
        meuCarro.setTamanho("Médio");

        System.out.println("\nInformações atualizadas do carro:");
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Tamanho: " + meuCarro.getTamanho());

        // Criando um objeto da classe FigurasGeometricas
        FigurasGeometricas minhaFigura = new FigurasGeometricas("Círculo", 0, 5.0);

        System.out.println("\nInformações da figura:");
        System.out.println("Nome: " + minhaFigura.getNome());
        System.out.println("Número de lados: " + minhaFigura.getLados());
        System.out.println("Raio: " + minhaFigura.getRaio());

        minhaFigura.circular();
        minhaFigura.perfurar();

        minhaFigura.setNome("Retângulo");
        minhaFigura.setLados(4);
        minhaFigura.setRaio(0); // Um retângulo não possui raio, então definimos como 0.

        System.out.println("\nInformações atualizadas da figura:");
        System.out.println("Nome: " + minhaFigura.getNome());
        System.out.println("Número de lados: " + minhaFigura.getLados());
        System.out.println("Raio: " + minhaFigura.getRaio());
        minhaFigura.retangular();

        // Criando um objeto da classe Flor
        Flor minhaFlor = new Flor("Vermelha", "Pequena", "Rosa");

        System.out.println("\nInformações da flor:");
        System.out.println("Cor: " + minhaFlor.getCor());
        System.out.println("Tamanho: " + minhaFlor.getTamanho());
        System.out.println("Espécie: " + minhaFlor.getEspecie());

        minhaFlor.apodrecer();
        minhaFlor.crescer();
        minhaFlor.morrer();

        minhaFlor.setCor("Amarela");
        minhaFlor.setTamanho("Grande");
        minhaFlor.setEspecie("Girassol");

        System.out.println("\nInformações atualizadas da flor:");
        System.out.println("Cor: " + minhaFlor.getCor());
        System.out.println("Tamanho: " + minhaFlor.getTamanho());
        System.out.println("Espécie: " + minhaFlor.getEspecie());

        // Criando um objeto da classe Fruta
        Fruta minhaFruta = new Fruta("Médio", "Amarela", "Doce");

        System.out.println("\nInformações da fruta:");
        System.out.println("Tamanho: " + minhaFruta.getTamanho());
        System.out.println("Cor: " + minhaFruta.getCor());
        System.out.println("Sabor: " + minhaFruta.getSabor());

        minhaFruta.comer();
        minhaFruta.apodrecer();
        minhaFruta.crescer();

        minhaFruta.setTamanho("Grande");
        minhaFruta.setCor("Laranja");
        minhaFruta.setSabor("Ácido");

        System.out.println("\nInformações atualizadas da fruta:");
        System.out.println("Tamanho: " + minhaFruta.getTamanho());
        System.out.println("Cor: " + minhaFruta.getCor());
        System.out.println("Sabor: " + minhaFruta.getSabor());  

        // Criando um objeto da classe Gato
        Gato meuGato = new Gato("Verde", "Macio", "Bola");

        System.out.println("\nInformações do gato:");
        System.out.println("Cor dos olhos: " + meuGato.getCorDosOlhos());
        System.out.println("Textura do pelo: " + meuGato.getTexturaDoPelo());
        System.out.println("Nome: " + meuGato.getNome());

        meuGato.miar();
        meuGato.dormir();
        meuGato.morder();

        meuGato.setCorDosOlhos("Azul");
        meuGato.setTexturaDoPelo("Peludo");
        meuGato.setNome("Bolinha");

        System.out.println("\nInformações atualizadas do gato:");
        System.out.println("Cor dos olhos: " + meuGato.getCorDosOlhos());
        System.out.println("Textura do pelo: " + meuGato.getTexturaDoPelo());
        System.out.println("Nome: " + meuGato.getNome());

        // Criando um objeto da classe Passaro
        Passaro meuPassaro = new Passaro("Piu", "Azul", 0.1);

        System.out.println("\nInformações do pássaro:");
        System.out.println("Nome: " + meuPassaro.getNome());
        System.out.println("Cor: " + meuPassaro.getCor());
        System.out.println("Peso: " + meuPassaro.getPeso());

        meuPassaro.voar();
        meuPassaro.comer();
        meuPassaro.cantar();

        meuPassaro.setNome("Tweety");
        meuPassaro.setCor("Amarelo");
        meuPassaro.setPeso(0.2);

        System.out.println("\nInformações atualizadas do pássaro:");
        System.out.println("Nome: " + meuPassaro.getNome());
        System.out.println("Cor: " + meuPassaro.getCor());
        System.out.println("Peso: " + meuPassaro.getPeso());
                    
        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("João", 30, 1.75);

        System.out.println("\nInformações da pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());

        pessoa.falar();
        pessoa.sorrir();
        pessoa.chorar();

        pessoa.setNome("Maria");
        pessoa.setIdade(25);
        pessoa.setAltura(1.65);

        System.out.println("\nInformações atualizadas da pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());

        // Criando um objeto da classe Sapato
        Sapato sapato = new Sapato("Nike", 42, "Preto");

        System.out.println("\nInformações do sapato:");
        System.out.println("Marca: " + sapato.getMarca());
        System.out.println("Tamanho: " + sapato.getTamanho());
        System.out.println("Cor: " + sapato.getCor());

        sapato.usar();
        sapato.guardar();

        sapato.setMarca("Adidas");
        sapato.setTamanho(41);
        sapato.setCor("Branco");

        System.out.println("\nInformações atualizadas do sapato:");
        System.out.println("Marca: " + sapato.getMarca());
        System.out.println("Tamanho: " + sapato.getTamanho());
        System.out.println("Cor: " + sapato.getCor());
    
    }
}

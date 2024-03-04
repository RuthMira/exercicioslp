// Ler a hora de inicio e a hora de fim de um jogo de xadrez(considere as horas inteiras , desconsidere os minutos) , e calcule a duração do jogo em horas ,sabendo-se que o tempo máximo de duração de um jogo é 24 horas, e que um jogo pode ter inicio em um dia e terminar no outro.
import java.util.Scanner;

public class exec14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora de inicio do jogo: ");
        int horaInicio = scanner.nextInt();

        System.out.println("Digite a hora do termino do jogo: ");
        int horaFim = scanner.nextInt();

        scanner.close();

        // Calculando a duração do jogo
        int duracao;

        if (horaInicio < horaFim) {
            // Mesmo dia
            duracao = horaFim - horaInicio;
        } else {
            // Jogo termina no próximo dia
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.println("A duração do jogo é de " + duracao + " horas.");
    }
}


import java.util.Scanner;
import java.util.Random;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] linguagens = {"java", "python", "javascript", "assembly", "c", "c++", "c#", "php"};
        String quiserJogar = "s";


        while (quiserJogar.equals("s") || quiserJogar.equals("sim")) {
            int indiceAleatorio = random.nextInt(linguagens.length);
            int chances = 5;

            System.out.println("Olá, seja bem vindo ao jogo da forca de linguagens de programação! A primeira linguagem tem " + linguagens[indiceAleatorio].length() + " letras.");
            String chute = scanner.nextLine().toLowerCase().trim();

            while (chances > 0) {

                if (chute.equals(linguagens[indiceAleatorio])) {
                    System.out.println("Parabéns! Você acertou. A linguagem era " + linguagens[indiceAleatorio] + "!");
                    break;
                } else if (chances == 1) {
                    chances--;
                    System.out.println("As suas chances acabaram. A linguagem era " + linguagens[indiceAleatorio]);
                    break;
                } else {
                    chances--;
                    System.out.println("Você errou, tem apenas mais " + chances + " tentativas.");
                }
                chute = scanner.nextLine().toLowerCase().trim();
            }
            System.out.println("Você deseja jogar novamente? (S/N)");
            quiserJogar = scanner.nextLine().toLowerCase().trim();
        }
        System.out.println("Até a próxima!");
    }
}

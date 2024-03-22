import java.util.Scanner;

public class VelocidadeMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o espaço percorrido (em metros): ");
        double espaco = scanner.nextDouble();
        
        System.out.println("Digite o tempo gasto (em segundos): ");
        double tempo = scanner.nextDouble();
        
        double velocidadeMedia = espaco / tempo;
        
        System.out.println("A velocidade média é: " + velocidadeMedia + " m/s");
    }
}
import java.util.Scanner;

public class VerificaNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();
        
        if (numero >= 0) {
            if (numero % 2 == 0) {
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é ímpar.");
            }
        } else {
            System.out.println("Este número não é positivo.");
        }
        
        scanner.close();
    }
}
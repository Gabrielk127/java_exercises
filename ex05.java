import java.util.Scanner;

public class ConversaoCambial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double taxaCambio = 5.0;
        
        System.out.println("Digite o valor em Reais (BRL) para converter para Dólares (USD): ");
        double valorReais = scanner.nextDouble();
        
        double valorDolares = valorReais / taxaCambio;
        
        System.out.printf("Valor em Dólares (USD): %.2f", valorDolares);
    }
}
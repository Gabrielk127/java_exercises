import java.util.Scanner;

public class Financiamento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do salário: ");
        double salario = scanner.nextDouble();
        
        System.out.println("Digite o valor do financiamento pretendido: ");
        double financiamento = scanner.nextDouble();
        
        if (financiamento <= 5 * salario) {
            System.out.println("Financiamento Concedido");
        } else {
            System.out.println("Financiamento Negado");
        }
        
        System.out.println("Obrigado por nos consultar.");
    }
}
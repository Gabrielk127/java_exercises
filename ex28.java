import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operacao;
        
        do {
            System.out.print("Digite a operação (+, -, *, /) ou 'S' para sair: ");
            operacao = scanner.next().charAt(0);
            
            if (operacao == 'S' || operacao == 's') {
                System.out.println("Saindo...");
                break;
            }
            
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            
            switch (operacao) {
                case '+':
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
            }
        } while (operacao != 'S' && operacao != 's');
        
        scanner.close();
    }
}
import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a massa da pessoa (em kg): ");
        double massa = scanner.nextDouble();
        
        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = scanner.nextDouble();
        
        double imc = massa / (altura * altura);
        
        System.out.printf("IMC: %.2f\n", imc);
        
        if (imc < 18.5) {
            System.out.println("Condição física: abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Condição física: no peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Condição física: Acima do peso");
        } else {
            System.out.println("Condição física: Obeso");
        }
        
        scanner.close();
    }
}
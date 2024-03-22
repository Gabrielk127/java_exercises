import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        double percentualAumento;
        if (salarioAtual <= 400) {
            percentualAumento = 15;
        } else if (salarioAtual <= 700) {
            percentualAumento = 12;
        } else if (salarioAtual <= 1000) {
            percentualAumento = 10;
        } else if (salarioAtual <= 1800) {
            percentualAumento = 7;
        } else if (salarioAtual <= 2500) {
            percentualAumento = 4;
        } else {
            percentualAumento = 0;
        }

        double aumento = salarioAtual * percentualAumento / 100;
        double novoSalario = salarioAtual + aumento;

        System.out.printf("%s %.0f%% %.2f %.2f\n", nome, percentualAumento, salarioAtual, novoSalario);
    }
}
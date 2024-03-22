import java.util.Scanner;

public class CalculoImpostoRenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();
        double aliquota = 0.0;

        if (salario <= 1434.59) {
            aliquota = 0.0;
        } else if (salario <= 2150.00) {
            aliquota = 7.5;
        } else if (salario <= 2866.00) {
            aliquota = 15.0;
        } else if (salario <= 3582.00) {
            aliquota = 22.5;
        } else {
            aliquota = 27.5;
        }

        double imposto = salario * (aliquota / 100);
        System.out.printf("A parcela mensal do imposto de renda a ser pago é: R$ %.2f", imposto);
    }
}
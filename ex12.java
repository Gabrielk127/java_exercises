import java.util.Scanner;

public class PesoIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o peso da criança (em kg):");
        double peso = scanner.nextDouble();

        System.out.println("Informe o sexo da criança (M para menino, F para menina):");
        char sexo = scanner.next().charAt(0);

        if (sexo == 'M' || sexo == 'm') {
            if (peso >= 8.5 && peso <= 12.5) {
                System.out.println("Idade: 1 ano\nMeninos: 8.5 kg a 12.5kg\nMeninas: 7.5kg a 11.5kg");
            } else if (peso >= 10.1 && peso <= 15.2) {
                System.out.println("Idade: 2 anos\nMeninos: 10.1 kg a 15.2kg\nMeninas: 9.8kg a 14.5kg");
            } else if (peso >= 11.7 && peso <= 18) {
                System.out.println("Idade: 3 anos\nMeninos: 11.7 kg a 18 kg\nMeninas: 11.4kg a 17.950kg");
            } else {
                System.out.println("Peso fora das faixas previstas na tabela.");
            }
        } else if (sexo == 'F' || sexo == 'f') {
            if (peso >= 7.5 && peso <= 11.5) {
                System.out.println("Idade: 1 ano\nMeninos: 8.5 kg a 12.5kg\nMeninas: 7.5kg a 11.5kg");
            } else if (peso >= 9.8 && peso <= 14.5) {
                System.out.println("Idade: 2 anos\nMeninos: 10.1 kg a 15.2kg\nMeninas: 9.8kg a 14.5kg");
            } else if (peso >= 11.4 && peso <= 17.95) {
                System.out.println("Idade: 3 anos\nMeninos: 11.7 kg a 18 kg\nMeninas: 11.4kg a 17.950kg");
            } else {
                System.out.println("Peso fora das faixas previstas na tabela.");
            }
        } else {
            System.out.println("Sexo informado é inválido.");
        }
    }
}
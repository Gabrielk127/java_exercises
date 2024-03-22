import java.util.Scanner;

public class RodizioVeicular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os 4 dígitos da placa do carro: ");
        int placa = scanner.nextInt();
        
        int ultimoDigito = placa % 10;
        
        switch (ultimoDigito) {
            case 1:
            case 2:
                System.out.println("Rodízio na Segunda-feira");
                break;
            case 3:
            case 4:
                System.out.println("Rodízio na Terça-feira");
                break;
            case 5:
            case 6:
                System.out.println("Rodízio na Quarta-feira");
                break;
            case 7:
            case 8:
                System.out.println("Rodízio na Quinta-feira");
                break;
            case 9:
            case 0:
                System.out.println("Rodízio na Sexta-feira");
                break;
            default:
                System.out.println("Dígito inválido");
        }
    }
}
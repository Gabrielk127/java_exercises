import java.util.Scanner;

public class CalculoPedagio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de eixos do veículo:");
        int eixos = scanner.nextInt();
        double valorPedagio = 0;

        switch (eixos) {
            case 1:
                valorPedagio = 11.00; // Valor para motocicletas
                break;
            case 2:
                valorPedagio = 22.00; // Valor para carros de passeio
                break;
            case 3:
                valorPedagio = 33.00; // Valor para veículos de pequeno porte com 3 eixos
                break;
            case 4:
                valorPedagio = 44.00; // Valor para caminhões pequenos
                break;
                
            default:
                valorPedagio = 55.00; // Valor padrão para veículos com mais de 4 eixos
                break;
        }

        System.out.printf("O valor do pedágio para um veículo com %d eixos é: R$%.2f\n", eixos, valorPedagio);
    }
}
import java.util.Scanner;

public class CalculoAzulejos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a altura da parede (AP) em metros:");
        double alturaParede = scanner.nextDouble();
        System.out.println("Digite a largura da parede (LP) em metros:");
        double larguraParede = scanner.nextDouble();
        
        System.out.println("Digite a altura do azulejo (AA) em metros:");
        double alturaAzulejo = scanner.nextDouble();
        System.out.println("Digite a largura do azulejo (LA) em metros:");
        double larguraAzulejo = scanner.nextDouble();
        
        double areaParede = alturaParede * larguraParede;
        double areaAzulejo = alturaAzulejo * larguraAzulejo;
        
        double quantidadeAzulejos = Math.ceil(areaParede / areaAzulejo);
        
        System.out.println("Quantidade de azulejos necessários: " + quantidadeAzulejos);
    }
}
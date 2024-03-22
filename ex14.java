import java.util.Scanner;


public class CalculoLeite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a massa do leite (em kg): ");
        double massa = scanner.nextDouble();
        
        System.out.println("Digite a densidade do leite (em kg/l): ");
        double densidade = scanner.nextDouble();
        
        System.out.println("Digite o preço por kg de leite: ");
        double precoPorKg = scanner.nextDouble();
        
        double volume = massa / densidade;
        String categoria;
        
        if (densidade < 1.14) {
            categoria = "Categoria I";
        } else if (densidade <= 1.20) {
            categoria = "Categoria II";
        } else {
            categoria = "Categoria III";
        }
        
        System.out.println("Valores digitados:");
        System.out.println("Massa: " + massa + " kg");
        System.out.println("Densidade: " + densidade + " kg/l");
        System.out.println("Preço por kg: R$ " + precoPorKg);
        
        System.out.println("Volume de leite calculado: " + volume + " l");
        System.out.println("Classificação do leite: " + categoria);
    }
}
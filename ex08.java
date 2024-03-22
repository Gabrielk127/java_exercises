import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();
        
        System.out.println("Valores originais: a = " + a + ", b = " + b);
        
        int c = a;
        a = b;
        b = c;
        
        System.out.println("Valores após a troca: a = " + a + ", b = " + b);
        
        scanner.close();
    }
}
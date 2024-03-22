import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de alunos da sala (m): ");
        int quantidadeAlunos = scanner.nextInt();
        
        double somaNotas = 0;
        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.print("Digite N" + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }
        
        double media = somaNotas / quantidadeAlunos;
        System.out.println("Média da sala: " + media);
        
        scanner.close();
    }
}
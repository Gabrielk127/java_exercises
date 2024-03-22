import java.util.Scanner;

public class ClassificacaoClientesSeguros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade do cliente:");
        int idade = scanner.nextInt();

        System.out.println("Informe o número de anos de uso do serviço de seguro:");
        int anosUso = scanner.nextInt();

        System.out.println("Informe o número de sinistros reportados:");
        int sinistros = scanner.nextInt();

        int pontosRisco = calcularPontosRisco(idade, anosUso, sinistros);
        String classificacao = classificarCliente(pontosRisco);

        System.out.println("Classificação do cliente: " + classificacao);
    }

    public static int calcularPontosRisco(int idade, int anosUso, int sinistros) {
        int pontos = 0;

        // Exemplo de cálculo de pontos baseado em critérios fictícios
        pontos += (idade > 50) ? 20 : 10;
        pontos += (anosUso < 5) ? 15 : 5;
        pontos += sinistros * 10;

        return pontos;
    }

    public static String classificarCliente(int pontosRisco) {
        if (pontosRisco <= 25) {
            return "Baixo Risco";
        } else if (pontosRisco <= 50) {
            return "Médio Risco";
        } else {
            return "Alto Risco";
        }
    }
}
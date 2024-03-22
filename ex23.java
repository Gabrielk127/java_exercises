public class NumerosPares {
    public static void main(String[] args) {
        int numero = 2; // Começa do 2 porque é o primeiro número par
        do {
            System.out.println(numero);
            numero += 2; // Incrementa de 2 em 2 para obter apenas números pares
        } while (numero <= 20);
    }
}
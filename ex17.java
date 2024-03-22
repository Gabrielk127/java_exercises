public class NumerosPares {
    public static void main(String[] args) {
        int numero = 20;
        while (numero >= 1) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero--;
        }
    }
}
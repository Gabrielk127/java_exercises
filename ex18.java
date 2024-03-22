public class NumerosParesImpares {
    public static void main(String[] args) {
        int numero = 1;
        
        while (numero <= 20) {
            if (numero % 2 == 0) {
                System.out.println(numero + " é par");
            } else {
                System.out.println(numero + " é ímpar");
            }
            numero++;
        }
    }
}
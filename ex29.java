public class SomaArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5}; // Exemplo de array
        int soma = 0;

        for(int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos números no array é: " + soma);
    }
}
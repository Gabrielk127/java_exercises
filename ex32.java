public class MenorElemento {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 2, 8, 1, 4};
        int menor = encontrarMenor(numeros);
        System.out.println("O menor elemento é: " + menor);
    }

    public static int encontrarMenor(int[] array) {
        int menor = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i]; 
            }
        }
        return menor;
    }
}
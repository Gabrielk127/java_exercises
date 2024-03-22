public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 7, 2, 9, 4};
        System.out.println("O maior elemento é: " + findLargestElement(array));
    }

    public static int findLargestElement(int[] array) {
        // Inicializa o maior elemento como o primeiro elemento do array
        int max = array[0];
        // Itera através do array começando do segundo elemento
        for(int i = 1; i < array.length; i++) {
            // Se o elemento atual é maior que max, atualiza max
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
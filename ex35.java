public class InverterArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Exemplo de array
        int tamanho = array.length;
        
        // Loop para inverter o array
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = array[i];
            array[i] = array[tamanho - 1 - i];
            array[tamanho - 1 - i] = temp;
        }
        
        // Imprimir o array invertido
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
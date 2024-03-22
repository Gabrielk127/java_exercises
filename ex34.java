public class CopyArray {
    public static void main(String[] args) {
        // Array original
        int[] originalArray = {1, 2, 3, 4, 5};
        
        // Array destino com o mesmo tamanho do array original
        int[] destinationArray = new int[originalArray.length];
        
        // Copiando elementos do array original para o array destino
        System.arraycopy(originalArray, 0, destinationArray, 0, originalArray.length);
        
        // Exibindo os elementos do array destino
        for (int i = 0; i < destinationArray.length; i++) {
            System.out.println(destinationArray[i]);
        }
    }
}
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Array de Integer para permitir a ordenação em ordem descendente
        Integer[] array = {5, 2, 8, 14, 1};
        
        // Ordenando o array em ordem descendente
        Arrays.sort(array, Collections.reverseOrder());
        
        // Imprimindo o array ordenado
        System.out.println(Arrays.toString(array));
    }
}
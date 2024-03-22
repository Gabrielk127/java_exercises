public class VerificaElemento {
    public static void main(String[] args) {
        int[] meuArray = {1, 2, 3, 4, 5}; // Exemplo de array
        int elementoParaBuscar = 3; // Elemento que queremos verificar se existe no array
        boolean encontrado = false;

        for (int elemento : meuArray) {
            if (elemento == elementoParaBuscar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(elementoParaBuscar + " foi encontrado no array.");
        } else {
            System.out.println(elementoParaBuscar + " não foi encontrado no array.");
        }
    }
}
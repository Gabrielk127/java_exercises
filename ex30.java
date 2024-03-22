public class ContadorDeVogais {
    public static void main(String[] args) {
        String texto = "Exemplo de String para contar vogais";
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contador++;
            }
        }

        System.out.println("Número de vogais na string: " + contador);
    }
}
public class ConceitoAluno {

    public static void main(String[] args) {

        int nota = 8; 
        
        String conceito;
        if (nota < 3) {
            conceito = "E";
        } else if (nota <= 5) { // Nota entre 3 e 5
            conceito = "D";
        } else if (nota <= 7) { // Nota entre 6 e 7
            conceito = "C";
        } else if (nota <= 9) { // Nota entre 8 e 9
            conceito = "B";
        } else { // Nota 10
            conceito = "A";
        }
        
        System.out.println("O conceito do aluno é: " + conceito);
    }
}
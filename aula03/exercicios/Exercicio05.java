import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        final int TURMA = 5;
        final int ALUNOS = 20;
        float mediaAluno, mediaTurma, mediaGeral = 0;

        for (int i = 1; i <= TURMA; i++) {
            mediaTurma = 0;
            for (int j = 1; j <= ALUNOS; j++) {
                System.out.printf("Digite a média do %02dº aluno da turma %d: ", j, i);
                mediaAluno = captura.nextFloat();
                mediaTurma += mediaAluno;
            }  
            mediaTurma = mediaTurma / ALUNOS;
            mediaGeral += mediaTurma;
            System.out.printf("A média da turma %d é: %.2f\n", i, mediaTurma);          
        }
        mediaGeral = mediaGeral / TURMA;
        System.out.printf("A média geral das turmas é: %.2f", mediaGeral);

        captura.close();
    }
}

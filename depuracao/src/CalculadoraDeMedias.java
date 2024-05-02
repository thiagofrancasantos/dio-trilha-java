import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos =  {"Thiago", "Inova", "Ribeirinho", "Maranhao"};

        double media = calcularMediaDaTurma(alunos, scan);

        System.out.printf("Media da turma: %.2f", media);

    }

    public static double calcularMediaDaTurma(String[] alunos, Scanner scanner){

        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma+=nota;
        }

        return soma/alunos.length;
    }
}

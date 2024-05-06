import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args){
        //Criando o objeto Scanner
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        //Imprimindo os dados informados pelo usuario

        System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
        System.out.println("Eu tenho " + idade + " anos");
        System.out.println("Minha  altura é " + altura + " cm");
        scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}

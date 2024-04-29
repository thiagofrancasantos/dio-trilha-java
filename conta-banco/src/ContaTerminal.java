import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e importar a clase Scanner
        // Exibir as mensagens para o nosso usuário
        // Obter pelo Scanner os valores digitados no terminal
        // Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o Saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia  + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

     }
}

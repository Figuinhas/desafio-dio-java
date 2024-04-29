import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String []args) {
        //Criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem vindo(a), Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o numero da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite também, o numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        //Imprimindo os dados inseridos pelo usuário
        System.out.println("Olá, " + nome + ", " + "obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", " + "conta " + numeroConta + " e seu saldo de R$" + saldo + " " + "já está disponível para saque.");
    }
}
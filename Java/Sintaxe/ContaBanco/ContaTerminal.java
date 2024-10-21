package Java.Sintaxe.ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Por favor, digite o seu Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o seu Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

// Fechando o scanner
        scanner.close();
    }
}

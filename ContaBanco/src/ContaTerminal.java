import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double saldo = 237.48;

        System.out.println("Por favor, informe seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, informe o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta +" e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}

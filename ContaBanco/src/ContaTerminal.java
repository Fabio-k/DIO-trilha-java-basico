import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int conta;
        String agencia;
        String nome;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        conta = Integer.parseInt(sc.nextLine());

        System.out.print("Digite o número da Agência: ");
        agencia = sc.nextLine();

        System.out.print("Digite o seu nome completo: ");
        nome = sc.nextLine();

        System.out.print("Digite o saldo da sua conta e.g 100.10: ");
        saldo = Double.parseDouble(sc.nextLine());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, conta, saldo);

        sc.close();

    }
}

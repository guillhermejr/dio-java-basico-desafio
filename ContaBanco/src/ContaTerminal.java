import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Seguiremos com a criação da sua conta bem vindo ao Banco BANESE :)");
        System.out.println();
        System.out.print("Digite seu nome: ");
        nomeCliente = leitor.nextLine();
        System.out.print("Qual agencia: ");
        agencia = leitor.nextLine();
        System.out.print("Qual valor sera depositado: ");
        saldo = leitor.nextDouble();

        numero = new Random().nextInt(999);

        leitor.close();
        System.out.println("--------------------------");
        System.out.println("Conta Criada com Sucesso!!");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + 1+numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}

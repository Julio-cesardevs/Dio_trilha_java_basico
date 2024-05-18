import java.util.Scanner;

public class ContaTerminal { 
    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para nosso usuário
        // Obter pela Scanner os valores digitado no termianl

        System.out.println("Digite o Número: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite a sua Agência: ");
        String agencia = scanner.next();

        double saldo = 237.48;

        // Exibir a mensagem conta criada
        System.out.println("Olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é " + saldo + " já está disponível para saque");

        // Fechar o Scanner
        scanner.close();

    }
}

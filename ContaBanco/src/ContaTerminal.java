import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int agencia, conta;
        double saldo = 237.48;
        String nomedoCliente = "Pedro Antônio Heinrich";  

        System.out.println("__________________________________");
        System.out.println(":: SEJA BEM VINDO AO BANCO JAVA ::\n");
        
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextInt();
        System.out.println("Agora digite o número da Conta Bancária: ");
        conta = scanner.nextInt();

        System.out.printf("Oá, %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo é R$ %f já está disponível para saque.\n\n\n", nomedoCliente, agencia, conta, saldo);
        System.out.println("1 - Consultar saldo\n");
        System.out.println("2 - Sair\n");

        int opcao = scanner.nextInt();

        
        switch(opcao) {
            case 1:
                System.out.printf("Seu saldo é: R$ %.2f%n\n", saldo);
                break;
            case 2:
                System.out.println("Saindo do sistema...\n\n\n");
                break;
                default:
                System.out.println("Opção inválida");
            }
        
        scanner.close();


    }
}

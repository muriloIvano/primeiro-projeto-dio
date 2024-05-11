import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    ContaBanco ContaBanco = new ContaBanco();

    System.out.println("Digite o número da sua conta bancária:");
    ContaBanco.numero = scanner.nextInt();
    
    System.out.println("Digite a agência:");
    ContaBanco.agencia = scanner.next();

    System.out.println("Digite seu nome:");
    ContaBanco.nome = scanner.next();

    System.out.println("Digite seu saldo:");
    ContaBanco.saldo = scanner.nextDouble();

    System.out.println("===========================================");
    ContaBanco.mostrarValores();
    System.out.println("===========================================");

    System.out.println("Digite [1] para realizar um saque e [2] para realizar um depósito:");
    int opcao = scanner.nextInt();

    if (opcao == 1) {
        System.out.println("Digite o valor do saque:");
        int saque = scanner.nextInt();
        ContaBanco.saldo = ContaBanco.saldo - saque;
    } else {
          System.out.println("Digite o valor do depósito:"); 
          double deposito = scanner.nextDouble();
          
          ContaBanco.saldo = ContaBanco.saldo + deposito;
    }
    System.out.println("==================================");
    System.out.println("Saldo em conta atualizado: R$"+ ContaBanco.saldo);
    System.out.println("==================================");

}
}

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


    ContaBanco.mostrarValores();

}
}

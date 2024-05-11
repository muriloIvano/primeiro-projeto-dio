public class ContaBanco {

    int numero = 1;
    String agencia = "";
    String nome = "";
    Double saldo =1.1;

    public void mostrarValores(){
        System.out.println("Número da Conta Bancária: " + numero);
        System.out.println("Número da Agência: " + agencia);
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Saldo em Conta: " + saldo);
    }
}

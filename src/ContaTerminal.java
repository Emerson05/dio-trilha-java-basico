import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, Digite o numero da Conta: ");
        int numero = scan.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scan.next();
        scan.nextLine();
        System.out.println("Digite seu Nome: ");
        String nomeCliente  = scan.nextLine();


        System.out.println("Digite um Saldo Inicial: ");
        double saldo = Double.parseDouble(scan.next().replace(',', '.'));


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é  " + numeroAgencia + ", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque");



    }
}

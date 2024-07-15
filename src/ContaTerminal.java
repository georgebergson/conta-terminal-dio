import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo = 237.48;
    Scanner entrada = new Scanner(System.in);

    public void cadastroConta(){
        System.out.println("Por favor, digite o número da Conta !");
        numero = Integer.parseInt(entrada.next());

        System.out.println("Por favor, digite o número da Agência !");
        agencia = entrada.next();

        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = entrada.next();
        
        System.err.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}

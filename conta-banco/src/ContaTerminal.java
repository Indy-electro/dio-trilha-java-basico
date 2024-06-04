import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Todo: Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as msgs para nosso usuario
        System.out.println("Informe o número da sua Conta ");
        int conta = scanner.nextInt();
       
        System.out.println("Informe o número da sua Agência com o dígito ");
        String agencia = scanner.next();
       
        System.out.println("Informe o seu primeiro nome ");
        String nome = scanner.next();
       
        System.out.println("Informe o saldo disponível na sua conta ");
        double saldo = scanner.nextDouble();

        //Obter pela classe Scanner os valores digitados no terminal

        //Exibir a msg final
        System.out.println("Olá " + nome + "! Obrigado por criar uma conta em nosso banco, sua Agência é: " + agencia + ", conta: " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}

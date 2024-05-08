import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:conhecer e importar a classe Scanner
        //Exibir msgs para o usuario
        System.out.println("Olá, por favor, responda os dados de informações de sua conta.");

        //Obter pela classe Scanner os valores digitados no terminal
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nComo você se chama? ");
        String nome = scanner.nextLine();
        System.out.println("\nQual o número de sua Agência? ");
        String agencia = scanner.nextLine();
        System.out.println("\nQual o número de sua conta? ");
        int numero = scanner.nextInt();
        System.out.println("\nQuanto você tem de saldo? ");
        float saldo = scanner.nextFloat();

        scanner.close();

        //Exibir a msg final

        System.out.println("\nOlá, "+ nome + "! Agradecemos por criar uma conta em nosso Banco!");
        System.out.println("Sua agência é: "+ agencia + "; Número: " + numero + " e seu saldo já está disponível para saque. Total disponível: " + saldo);
    

    }
}

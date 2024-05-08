import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:conhecer e importar a classe Scanner
        //Exibir msgs para o usuario
        System.out.println("Olá, por favor, responda os dados de informações de sua conta.");

        //Obter pela classe Scanner os valores digitados no terminal
        Scanner nome = new Scanner(System.in);
        System.out.println("Como você se chama? ");
        Scanner agencia = new Scanner(System.in);
        System.out.println("Qual o número de sua Agência? ");
        Scanner numero = new Scanner(System.in);
        System.out.println("Qual o número de sua conta? ");
        Scanner saldo = new Scanner(System.in);
        System.out.println("Quanto você tem de saldo? ");

        scanner.close();

        //Exibir a msg final
        String meuNome = nome.nextLine(); 
        String minhaAgencia = agencia.nextLine();
        String meuNumero = numero.nextLine();
        String meuSaldo = saldo.nextLine();

        System.out.println("Olá, "+ meuNome + "! Agradecemos por criar uma conta em nosso Banco!");
        System.out.println("Sua agência é: "+ minhaAgencia + "; Número: " + meuNumero + " e seu Saldo já está disponível para saque. Total disponível: " + meuSaldo);
    
    }
}

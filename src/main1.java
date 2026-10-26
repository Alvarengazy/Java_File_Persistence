import java.util.Scanner;

public class main1 {

    public static Scanner scanner = new Scanner(System.in);
    public static  GerenciadorNomes gerenciar = new GerenciadorNomes();

    public static void main(String[] args) {
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();


        gerenciar.salvarnome(nome);

        System.out.println("\nNomes cadastrados:");
        gerenciar.lernomes();

        scanner.close();
    }
    
}
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
      String nome = "";
        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe seu nome completo");
        nome = scanner.nextLine();
        System.out.println("Bem-vindo, " + nome.toLowerCase());
        System.out.println("Seu nome tem, " + nome.length() + " caracter");
    }
}

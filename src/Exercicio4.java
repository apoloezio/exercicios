import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
      String nome = "";
        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe seu nome completo");
        nome = scanner.nextLine();

        if (nome.contains(" ")) {
            System.out.println("Seu nome e composto");
        } else {
            System.out.println("Seu nome nao e composto");
        }
        System.out.println(nome);
    }
}

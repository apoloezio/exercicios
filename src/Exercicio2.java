import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Integer numero1 = 0;
        Integer numero2 = 0;
        Integer resultado = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro valor");
        numero1 = input.nextInt();

        System.out.println("Insira o segundo valor");
        numero2 = input.nextInt();

        resultado = numero1 + numero2;
        System.out.println(resultado);
    }
}

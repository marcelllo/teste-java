import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = leia.nextInt();

        System.out.println("O dobro de " + numero + " é " + (numero * 2));
    }
}
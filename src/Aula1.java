import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um n�mero");
        int numero = leia.nextInt();
        int dobro = numero * 2;
        int triplo = numero * 3;

        System.out.println("O dobro de " + numero + " � " + dobro);
        System.out.println("O triplo de " + numero + " � " + triplo);
    }
}
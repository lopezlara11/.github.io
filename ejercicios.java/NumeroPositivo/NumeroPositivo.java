import java.util.Scanner;

public class NumeroPositivo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Digite un número: ");
        numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero == 0) {
            System.out.println("El número es cero.");
        } else {
            System.out.println("El número es negativo.");
        }
    }
}

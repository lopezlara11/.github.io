import java.util.Random;

public class ejercicio1 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] A = new int[10];
        int contador = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(11) + 10;
            if (A[i] > 10 && A[i] < 20) {
                contador++;
            }
        }

        System.out.print("Números generados: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nCantidad de números entre 10 y 20: " + contador);
    }
}

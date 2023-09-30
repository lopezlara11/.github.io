public class SiPuedeoNoVotar {
    public static void main(String[] args) {
        int edad = 25;
        int problemasLegales = 2;

        if (edad >= 18 && problemasLegales == 0) {
            System.out.println("La persona puede votar.");
        } else {
            System.out.println("La persona no puede votar.");
        }

    }
}

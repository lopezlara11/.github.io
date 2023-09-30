public class NotasDelEstudiante {

    public static void main(String[] args) {
        int nota = 85;

        boolean Aprobado = esAprobado(nota);

        if (Aprobado) {
            System.out.println("El estudiante ha aprobado.");
        } else {
            System.out.println("El estudiante no ha aprobado.");
        }
    }

    public static boolean esAprobado(int nota) {

        return nota >= 60 && nota <= 100;
    }
}

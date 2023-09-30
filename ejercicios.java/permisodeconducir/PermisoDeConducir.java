public class PermisoDeConducir {

    public static void main(String[] args) {
        int edad = 20;

        boolean esMayorDeEdad = esAprobado(edad);

        if (esMayorDeEdad) {
            System.out.println("Esta persona es mayor de edad. Por tanto, tiene permiso de conducir.");
        } else {
            System.out.println("Esta persona no es mayor de edad. Por tanto, no tiene permiso de conducir.");
        }
    }

    public static boolean esAprobado(int edad) {
        return edad > 18;
    }
}

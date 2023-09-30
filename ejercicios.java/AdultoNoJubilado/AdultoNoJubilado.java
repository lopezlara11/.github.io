public class AdultoNoJubilado {
    public static void main(String[] args) {
        int edad = 26;
        int edadJubilacion = 65;

        if (esAdulto(edad) && !esJubilado(edad, edadJubilacion)) {
            System.out.println("La persona es adulta y no está jubilada.");
        } else {
            System.out.println("La persona no es adulta o está jubilada.");
        }
    }

    public static boolean esAdulto(int edad) {
        return edad >= 18;
    }

    public static boolean esJubilado(int edad, int edadJubilacion) {
        return edad >= edadJubilacion;
    }
}

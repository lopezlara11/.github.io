public class RequisitosSalaVip {

    public static void main(String[] args) {
        int edad = 20;
        boolean esMayorDeEdad = esMayorDeEdad(edad);
        boolean tieneAccesoSalaVIP = tieneAccesoSalaVIP(edad);
        boolean tieneInvitacionEspecial = tieneInvitacionEspecial();

        if (esMayorDeEdad) {
            if (tieneAccesoSalaVIP || tieneInvitacionEspecial) {
                System.out.println("Esta persona tiene acceso a la sala VIP.");
            } else {
                System.out.println("Esta persona no tiene acceso a la sala VIP.");
            }
        } else {
            System.out.println("Esta persona no es mayor de edad. No tiene acceso a la sala VIP.");
        }
    }

    // verificar si es mayor de edad
    public static boolean esMayorDeEdad(int edad) {
        return edad >= 20;
    }

    // verificar si tiene acceso a la sala VIP
    public static boolean tieneAccesoSalaVIP(int edad) {
        return edad >= 18;
    }

    // Método para verificar si tiene invitación especial
    public static boolean tieneInvitacionEspecial() {
        return true;

    }
}

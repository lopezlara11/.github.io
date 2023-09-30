public class Palabras {
    public static void main(String[] args) {
        String cadena = " El mejor lenguaje de programacion es Java.";

        if (cadena.contains("Java") && !cadena.contains("Python")) {
            System.out.println("La cadena contiene 'Java' y no contiene 'Python'.");
        } else {
            System.out.println("La cadena no cumple con las condiciones.");
        }
    }
}

public class Cadenadetexto {

    public static void main(String[] args) {
        System.out.println(containsLetterAorB("abecedario"));
    }

    public static boolean containsLetterAorB(String text) {

        String lowerCaseText = text.toLowerCase();

        return lowerCaseText.matches(".*[ab].*");
    }
}

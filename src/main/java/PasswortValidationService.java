public class PasswortValidationService {
    public static void main(String[] args) {
        welcome();
        rules();
        String ergebnis= hasMinLenght("abcdef");
        System.out.println(ergebnis);
        String hatZahl = hasNumber("testtest55");
        System.out.println(hatZahl);
        String hatkleinenBuchstaben = hasLowerCase("HALLO");
        System.out.println(hatkleinenBuchstaben);
        String hatgroßenBuchstaben = hasUpperCase("hallo");
        System.out.println(hatgroßenBuchstaben);
    }

    public static void welcome() {

        System.out.println("Bitte geb dein Passwort ein");
    }

    public static void rules() {
        System.out.println("Das Passwort darf 5-10 Zeichen haben und musst mind. 1 Zahl enthalten");
    }

    public static String hasMinLenght (String input) {
        if (input.length() < 5 || input.length() > 10) {
            return "Passwortlänge inkorrekt";
        } else {
            return "Passwortlänge korrekt";
        }
    }

    public static String hasNumber(String input) {
        String regex = "(.*[0-9].*)";
        if (input.matches(regex)) {
            return "Zahl enthalten";
        } else {
            return "Zahl nicht enthalten";
        }
    }
    public static String hasLowerCase(String input){
        String regex = "(.*[a-z].*)";
        if (input.matches(regex)) {
            return "kleiner Buchstabe enthalten";
        } else {
            return "kleiner Buchstabe nicht enthalten";
        }
    }

    public static String hasUpperCase(String input){
        String regex = "(.*[A-Z].*)";
        if (input.matches(regex)) {
            return "großer Buchstabe enthalten";
        } else {
            return "großer Buchstabe nicht enthalten";
        }
    }


}



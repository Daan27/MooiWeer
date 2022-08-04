import java.util.Scanner;

public class MooiWeer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Is het mooi weer? Antwoord met \"true\" of \"false\".");
        boolean weer = Boolean.parseBoolean(scan.nextLine());

        if (weer) {
            System.out.println("Wat fijn. Geniet van het mooie weer.");
        } else {
            System.out.println("Helaas. Maar herinner je dat achter de wolken de zon schijnt en dat minder mooi weer ook een moment van reflectie kan bieden.");
        }
    }
}

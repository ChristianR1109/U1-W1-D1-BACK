import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("---------------ESERCIZIO 2---------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa");
        String s1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa");
        String s2 = scanner.nextLine();
        System.out.println("Inserisci la terza stringa");
        String s3 = scanner.nextLine();

        String conc = concatenazione(s1, s2, s3);
        System.out.println(conc);

        scanner.close();
    }

    public static String concatenazione(String s1, String s2, String s3) {
        return s1 + s2 + s3;
    }
}
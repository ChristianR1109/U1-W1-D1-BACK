import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("---------------ESERCIZIO 3---------------");
        System.out.println("---------------perimetroRettangolo---------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il valore della base");
        int l1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il valore dell'altezza");
        int l2 = Integer.parseInt(scanner.nextLine());
        System.out.println(perimetroRettangolo(l1, l2));
        System.out.println("---------------pariDispari---------------");
        System.out.println("Inserisci un numero intero");
        int n1 = Integer.parseInt(scanner.nextLine());
        pariDispari(n1);
        System.out.println("---------------perimetroTriangolo---------------");
        System.out.println("Inserisci il valore del primo lato");
        int ll1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il valore del secondo lato");
        int ll2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci il valore del terzo lato");
        int ll3 = Integer.parseInt(scanner.nextLine());
        System.out.println(perimetroTriangolo(ll1, ll2, ll3));
    }

    public static double perimetroRettangolo(double l1, double l2) {
        return (l1 + l2) * 2;
    }

    public static void pariDispari(int n) {
        if (n % 2 == 0) {
            System.out.println("Il numero inserito è pari, risultato 0 ");
        } else {
            System.out.println("Il numero inserito è dispari, risultato 1");
        }

    }

    public static double perimetroTriangolo(double ll1, double ll2, double ll3) {
        double p = (ll1 + ll2 + ll3) / 2;
        double area = Math.sqrt(p * (p - ll1) * (p - ll2) * (p - ll3));
        return area;
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("---------------ESERCIZIO 1---------------");
        System.out.println("---------------MOLTIPLICA---------------");

        int n1 = 2;
        int n2 = 8;
        int molt = moltiplica(n1, n2);
        System.out.println(molt);
        String s1 = "prova";
        int nn1 = 13;

        System.out.println("---------------CONCATENA---------------");

        String conc = concatena(s1, nn1);
        System.out.println(conc);

        System.out.println("---------------InserisciInArray---------------");

        String[] cinqueEl = {"el1", "el2", "el3", "el4", "el5"};
        String sestoEl = ("elFurbo");

        String[] seiEl = {"", "", "", "", "", ""};
        seiEl[0] = cinqueEl[0];
        seiEl[1] = cinqueEl[1];
        seiEl[2] = sestoEl;
        seiEl[3] = cinqueEl[2];
        seiEl[4] = cinqueEl[3];
        seiEl[5] = cinqueEl[4];
        for (int i = 0; i < 6; i++) {
            System.out.println(seiEl[i]);

        }
    }

    public static int moltiplica(int n1, int n2) {
        return n1 * n2;
    }

    public static String concatena(String s1, int nn1) {
        return s1 + nn1;
    }
}
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apasa o litera (R, G, V): ");
        char litera = sc.next().toUpperCase().charAt(0);

        switch (litera) {
            case 'R':
                System.out.println("Rosu");
                break;
            case 'G':
                System.out.println("Galben");
                break;
            case 'V':
                System.out.println("Verde");
                break;
            default:
                System.out.println("Litera necunoscuta!");
        }

    }
}

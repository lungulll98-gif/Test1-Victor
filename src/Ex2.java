import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        int primulNumar = scanner.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int alDoileanumar = scanner.nextInt();

        System.out.print("Rezultatul final este: " + primulNumar * alDoileanumar);



    }
}

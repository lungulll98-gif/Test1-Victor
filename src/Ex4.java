import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti primul numar: ");
        int primulNumar = scanner.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int alDoileaNumar = scanner.nextInt();


        if( primulNumar > alDoileaNumar ) {
            System.out.println("Primul numar este mai mare"); }
            else {
                System.out.println("Primul numar este mai mic");
            }
        }

    }


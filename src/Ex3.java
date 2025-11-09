import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      System.out.print("Introduceti primul numar: ");
      int primulNumar = scanner.nextInt();
      System.out.print("Introduceti al doilea numar: ");
      int alDoileaNumar = scanner.nextInt();

        System.out.println("Adunarea celor doua numere: "+ (primulNumar + alDoileaNumar));
        System.out.println("Scaderea celor doua numere: "+ (primulNumar - alDoileaNumar));
        System.out.println("Inmultirea celor doua numere: "+ (primulNumar * alDoileaNumar));
        System.out.println("Impartirea celor doua numere: "+ (primulNumar / alDoileaNumar));
        System.out.println("Restul celor doua numere: "+ (primulNumar / alDoileaNumar));

    }
}

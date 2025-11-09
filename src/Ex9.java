import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti luna dorita: ");
        int month = scanner.nextInt();
        String season = "";

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Nu a fost gasita nici o asociere.";
        }
        System.out.println("Luna noiembrie este in " + season + ".");
    }
}
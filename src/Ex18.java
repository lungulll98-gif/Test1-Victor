public class Ex18 {
    public static void main(String[] args) {

                int[] numere = {4, 7, 2, 9, 1, 5};
                int minim = numere[0];

                for (int i = 1; i < numere.length; i++) {
                if (numere[i] < minim) {
                minim = numere[i];
            }
        }

        System.out.println("Elementul cu valoarea cea mai mare este: " + minim);
    }
}

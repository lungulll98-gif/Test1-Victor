public class Ex17 {
    public static void main(String[] args) {
        int[] numere = {4, 7, 2, 9, 1, 5};

        int maxim = numere[0];

                for (int i = 1; i < numere.length; i++) {
                if (numere[i] > maxim) {
                maxim = numere[i];
            }
        }

        System.out.println("Elementul cu valoarea cea mai mare este: " + maxim);
    }
}
public class Main {
    public static void main(String[] args) {
//       luasPersegi(20,30);

        System.out.println("Angka ini positif, negatif atau zero (0) jawabannya adalah " + checkPositifNegatifZero(0));
    }

    //Method
    public static void luasPersegi(int panjang, int lebar) {
        System.out.println("Luas Persegi adalah = " + (panjang * lebar));

    }

    public static int kelilingPersegi(int sisi) {
        int hasil = sisi * 4;
        return hasil;
    }

    public static int calculateMyAge(int yearOfBirth) {
        return (2023 - yearOfBirth);
    }

    // Cara melakukan pencekean positif dan negatif ataupun 0 buat method dengan return string "Positif", "Negatif", Zero dengan memasukan 1 parameter

    public static String checkPositifNegatifZero(int value) {
        if (value > 0) {
            return "Positif";
        } else if (value < 0) {
            return "Negatif";
        }

        return "Zero";
    }
}
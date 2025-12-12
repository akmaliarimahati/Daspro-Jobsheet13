import java.util.Scanner;

public class PenjumlahanRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;

        System.out.print("Masukkan Bilangan Yang Dihitung: ");
        bilangan = sc.nextInt();

        System.out.println(" = " + hitungBilangan(bilangan));

        sc.close();
    }

    static int hitungBilangan(int f) {
        if (f == 1) {
            System.out.print("1");
            return (1);
        } else {
            int jml = hitungBilangan(f - 1);
            System.out.print(" + " + f);
            return f + jml;
        }
    }
}

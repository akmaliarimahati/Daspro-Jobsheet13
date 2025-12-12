import java.util.Scanner;

public class DeretDescendingRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Bilangan: ");
        int bilangan = sc.nextInt();

        System.out.println(rekursif(bilangan));
        iteratif(bilangan);
        sc.close();
    }

    static int rekursif(int n) {
        if (n == 0) {
            return (0);
        } else {
            System.out.print(n + " ");
            return (rekursif(n - 1));
        }
    }

    static int iteratif(int n) {
        int faktor = 0;
        for (int i = n; i >= 0; i--) {
            faktor = i;
            System.out.print(faktor + " ");
        }
        return faktor;
    }
}

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Bulan Ke-: ");
        int bulan = sc.nextInt();
        int hasil = marmut(bulan);

        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + hasil);
        sc.close();
    }

    static int marmut(int bln) {
        if (bln == 1 || bln == 2) {
            return 1;
        } else {
            return marmut(bln - 1) + marmut(bln - 2);
        }
    }
}

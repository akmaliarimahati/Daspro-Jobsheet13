import java.util.Scanner;

public class CekPrimaRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Bilangan: ");
        int bilangan = sc.nextInt();

        if (cekPrima(bilangan, bilangan - 1)) {
            System.out.println(bilangan + " Adalah Bilangan Prima");
        } else {
            System.out.println(bilangan + " Bukan Bilangan Prima");
        }
    sc.close();
    }

    static boolean cekPrima(int n, int y){
        if (n <= 1) {
            return false;
        } else if (y == 1) {
            return true;
        } else if (n % y == 0){
            return false;
        } else {
            return cekPrima(n, y - 1);
        }
    }
}

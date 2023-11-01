import java.util.Scanner;
public class ForKelipatan28{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int kelipatan, counter = 0, total = 0;

        System.out.printf("Masukkan bilangan kelipatan (1 - 9) : ");
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }

        System.out.printf("Banyaknya bilangan dari 1 sampai 50 adalah %d\n", counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
    }
}
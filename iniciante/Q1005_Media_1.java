package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Q1005_Media_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double media = ((A * 3.5) + (B * 7.5))/11;

        System.out.printf("MEDIA = %.5f", media);
    }
}

package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Q1011_Esfera {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        final double pi = 3.14159;
        double volume = (4.0/3) * pi * (raio * raio * raio);

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}

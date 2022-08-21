/*
   Questão 1006 - Média 2

   Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1006

   @author: Victor Ribeiro
 */
package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Q1006_Media_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double media = ((A * 2) + (B * 3) + (C * 5))/10;

        System.out.printf("MEDIA = %.1f\n", media);
    }
}

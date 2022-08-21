/*
   Questão 1016 - Distância

   Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1016

   @author: Victor Ribeiro
 */
package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Q1016_DIstancia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();

        System.out.printf("%d minutos\n", distancia * 2);
    }
}

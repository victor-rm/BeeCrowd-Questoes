/*
   Questão 1014 - Consumo

   Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1014

   @author: Victor Ribeiro
 */
package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Q1014_Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distancia_total =  sc.nextInt();
        float combustivel_gasto = sc.nextFloat();

        float consumo = distancia_total / combustivel_gasto;

        System.out.printf("%.3f km/l\n", consumo);
    }
}

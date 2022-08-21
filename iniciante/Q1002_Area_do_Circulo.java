/*
   Questão 1002 - Área do Círculo

   Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1002

   @author: Victor Ribeiro
 */
package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Q1002_Area_do_Circulo {
    public static void main(String[] args) throws IOException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double pi = 3.14159;

        sc.close();

        double area = pi * (raio * raio);

        System.out.printf("A=%.4f\n", area);
    }
}

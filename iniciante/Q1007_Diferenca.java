/*
   Questão 1007 - Diferença

   Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1007

   @author: Victor Ribeiro
 */
package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Q1007_Diferenca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int diferenca = (A * B - C * D);

        System.out.printf("DIFERENCA = %d\n", diferenca);
    }
}

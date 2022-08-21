/*
   Questão 1010 - Cálculo Simples

   Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1010

   @author: Victor Ribeiro
 */
package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Q1010_Calculo_Simples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int numero_peca = sc.nextInt();
        double valor_peca = sc.nextDouble();
        int codigo2 = sc.nextInt();
        int numero_peca2 = sc.nextInt();
        double valor_peca2 = sc.nextDouble();

        double valor_total = (numero_peca * valor_peca) + (numero_peca2 * valor_peca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor_total);
    }
}

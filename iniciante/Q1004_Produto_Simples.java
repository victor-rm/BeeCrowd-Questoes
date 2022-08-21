/*
   Questão 1004 - Produto Simples

   link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1004

   @author: Victor Ribeiro
 */
package iniciante;

import java.util.Scanner;

public class Q1004_Produto_Simples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int PROD = A * B;

        System.out.printf("PROD = %d\n", PROD);
    }
}

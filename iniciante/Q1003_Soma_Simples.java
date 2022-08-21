/*
   Questão 1003 - Soma Simples

   Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1003

   @author: Victor Ribeiro
 */
package iniciante;

import java.io.IOException;
import java.util.Scanner;


public class Q1003_Soma_Simples {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int soma = A + B;

        System.out.printf("SOMA = %d\n", soma);
    }
}

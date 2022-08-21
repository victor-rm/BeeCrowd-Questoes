/*
   Questão 1008 - Salário

   Link da questão: https://www.beecrowd.com.br/judge/pt/problems/view/1008

   @author: Victor Ribeiro
 */
package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Q1008_Salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int horas = sc.nextInt();
        double valor = sc.nextDouble();

        double salario = horas * valor;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}

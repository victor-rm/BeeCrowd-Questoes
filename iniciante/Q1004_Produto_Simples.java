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

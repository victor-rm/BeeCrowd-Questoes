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

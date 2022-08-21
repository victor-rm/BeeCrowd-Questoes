package iniciante;

import java.util.Scanner;

public class Q1013_O_Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();

        int maior = maiorab(maiorab(valor1, valor2), valor3);
        System.out.printf("%d eh o maior\n", maior);

    }
    public static int maiorab(int valor1, int valor2) {
        return (valor1+valor2+Math.abs(valor1-valor2))/2;

    }
}

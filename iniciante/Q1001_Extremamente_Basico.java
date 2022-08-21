package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Q1001_Extremamente_Basico {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int primeiro_numero = sc.nextInt();
        int segundo_numero = sc.nextInt();

        int numero = primeiro_numero + segundo_numero;

        System.out.println("X = " + numero);
    }
}


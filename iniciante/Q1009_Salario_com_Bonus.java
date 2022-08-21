package iniciante;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.math.RoundingMode;

public class Q1009_Salario_com_Bonus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DecimalFormat deciFormat = new DecimalFormat();

        deciFormat.setRoundingMode(RoundingMode.HALF_DOWN);
        String nome = sc.nextLine();

        double salario_fixo = sc.nextDouble();
        double montante_total = sc.nextDouble();

        sc.close();

        double salario = (montante_total * 0.15) + salario_fixo;

        String salario_formatado = new DecimalFormat("TOTAL = R$ ###0.00").format(salario);

        System.out.println(salario_formatado);
    }
}

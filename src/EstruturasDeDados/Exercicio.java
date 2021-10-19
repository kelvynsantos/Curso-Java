package EstruturasDeDados;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notas = new double[4];

        notas[0] = 7.8;
        notas[1] = 4.5;
        notas[2] = 6.5;
        System.out.println(Arrays.toString(notas));
         double total = 0;
        for(int i = 0; i< notas.length;i++) {
            total+= notas[i];
        }
        System.out.println(total/notas.length);

        double[] notab = {6.9,4.7,5.6,8.3};

        double totalb = 0;
        for (int i = 0;i < notab.length;i++) {
            total += notab[i];
        }
        System.out.println(totalb/notab.length);
    }
}

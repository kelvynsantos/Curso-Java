package EstruturasDeDados.desafios.d;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero de notas:");
       int i = input.nextInt();
       input.close();
        double[] notas = new  double[i];
         for (int j = 0;j < i; j++) {
             System.out.printf("Digite a nota %d°",j+1);
             notas[j] = input.nextDouble();
              input.close();
         }
           double total = 0;
         for ( double n : notas) {
             total += n;
         }
        System.out.println("media "+ total/notas.length);
    }
}

package OO.Heranca.test;

import OO.Heranca.dsf.Fusca;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Fusca f1 = new Fusca(22,44);

        Scanner input = new Scanner(System.in);
        System.out.println("Velocidade:");
        f1.VelAtual = input.nextInt();
        f1.acelerar();
        f1.acelerar();

        System.out.println(f1.toString());

    }
}

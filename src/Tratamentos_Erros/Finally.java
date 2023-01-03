package Tratamentos_Erros;

import java.util.Scanner;

public class Finally {
     Scanner input = new Scanner(System.in); //tirar static
    public static void main(String[] args) {
        try {
//            System.out.println(7 / input.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finalmente");
//            input.close();
        }
        System.out.println("end");
    }
}

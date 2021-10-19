package EstruturasDeDados;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("Quantos alunos ?");
        int qtdA = input.nextInt();

        System.out.println("Quantas notas ? ");
        int qtdN = input.nextInt();

        double[][] ntsTurma = new double[qtdA][qtdN];
        double total = 0;
        for (int i = 0;i< ntsTurma.length;i++){
            for (int j = 0; j < ntsTurma[i].length; j++){
                System.out.printf("Informe a nota %d do aluno %d ", i+1,j+1);
                ntsTurma[i][j] = input.nextDouble();
                total += ntsTurma[i][j];
            }
        }
        input.close();
        double media = total/(qtdA*qtdN);
        System.out.printf("Total : %.2f. ",total);
        System.out.printf("Média : %.2f ",media);
    }
}

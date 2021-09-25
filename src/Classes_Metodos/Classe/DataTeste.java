package Classes_Metodos.Classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        Data d2 = new Data();

        d1.dia = 12;
        d1.mes = 12;
        d1.ano = 2020;
        d2.dia = 22;
        d2.mes = 7;
        d2.ano = 2021;

        System.out.printf("%d/%d/%d\n",d1.dia,d1.mes,d1.ano);
        System.out.printf("%d/%d/%d",d2.dia,d2.mes,d2.ano);

    }
}

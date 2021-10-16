package Classes_Metodos;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(12,12,2020);
        Data d2 = new Data(22,7,2021);
        Data d3 = new Data();

        System.out.println(d1.obterData());
        d2.imprimirData();
        System.out.println(d3.obterData());

    }
}

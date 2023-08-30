public class DataTeste {
    public static void main(String[] args) {
        Data nasc = new Data();
        nasc.dia = 19;
        nasc.mes = 03;
        nasc.ano = 1983;

        System.out.println(nasc.dia +"/"+ nasc.mes+"/"+nasc.ano);
        System.out.prinf("%d/%d/%d", nasc.dia, nasc.mes,nasc.ano);
        System.out.println(nasc.formatar());
        
    }
}

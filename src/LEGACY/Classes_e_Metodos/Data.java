public class Data {
    int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    String formatar(){
        return String.format("%d/%d/%d", dia, mes,ano);
    }
}

package Classes;

public class Data {
     int dia;
     int mes;
     int ano;
     Data() {
//          dia = 1;
//          mes = 1;
//          ano = 1970;
          this(1,1,1970);
     }
     Data(int dia, int mes, int ano){
          this.dia = dia;
          this.mes = mes;
          this.ano = ano;
     }
     String obterData() {
          final String formato = "%d/%d/%d";
          return String.format(formato,this.dia,this.mes,this.ano);
     }

     void imprimirData()
     {
          System.out.println(this.obterData());
     }

}

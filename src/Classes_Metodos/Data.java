package Classes_Metodos;

public class Data {
     int dia;
     int mes;
     int ano;
     Data() {
          dia = 1;
          mes = 1;
          ano = 1970;
     }
     Data(int diaData, int mesData, int anoData){
          dia = diaData;
          mes = mesData;
          ano = anoData;
     }
     String obterData() {
          return String.format("%d/%d/%d",dia,mes,ano);
     }

     void imprimirData(){
          System.out.printf("%d/%d/%d\n",dia,mes,ano);
     }
}

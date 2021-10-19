package Classes;

public class ValueNull {
    public static void main(String[] args) {
        String s1 ;
        String s2 = Math.random() > 0.5 ? "heyy" : null;
        Data d1 = Math.random() > 0.5 ? new Data() : null;

       // System.out.println(s1); // NullPointerException
        if(d1 != null) {
            d1.mes = 12;
            System.out.println(d1.obterData());
        }
        if (s2 != null) {
        System.out.println(s2.concat(s2)); //NullPointerException
        }
    }
}

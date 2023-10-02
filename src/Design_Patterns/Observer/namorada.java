package src.Design_Patterns.Observer;

public class namorada implements  Observer{
    public void chegou(EventChegadaAni evento){
        System.out.println("Avisar convidados");
        System.out.println("apagar luzes");
        System.out.println("esperar");
        System.out.println("surpresa!");
    }
}

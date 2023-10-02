package src.Design_Patterns.Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class porteiro {
    private List<Observer> observers = new ArrayList<>();
    public void registrarObservers(Observer o) {
        observers.add(o);
    }
    public void monitorar(){
        Scanner input = new Scanner(System.in);
        String valor = "";
        while (!"sair".equalsIgnoreCase(valor)){
            System.out.println("chegou?");
            valor = input.nextLine();
            if("sim".equalsIgnoreCase(valor)){
                EventChegadaAni evento = new EventChegadaAni(new Date());
                // notify
                observers.stream().forEach(o -> o.chegou(evento));
                valor = "sair";
            } else {
                System.out.println("alarme falso");
            }
            input.close();

        }
    }
}

package src.Design_Patterns.Observer;

import java.util.Date;

public class EventChegadaAni {
    private final Date momento;
    public EventChegadaAni( Date momento) {
        this.momento = momento;
    }
    public Date getMomento(){
        return momento;
    }

}

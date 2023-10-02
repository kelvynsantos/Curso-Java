package src.Design_Patterns.Observer;

public class surpresa {
    public static void main(String[] args) {
        namorada n = new namorada();
        porteiro p = new porteiro();

        p.registrarObservers(n);
        p.monitorar();
    }
}

package Projects.EmailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email e1 = new Email("John","Smith");
//        System.out.println(e1);
        System.out.println(e1.randomPassword());
//        System.out.println("pss on contructor = " + e1.getPassword());
        System.out.println(e1.toString());
    }
}

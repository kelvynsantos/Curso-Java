package Classes_Metodos;

public class AreaCircTeste {
    public static void main(String[] args) {
    AreaCirc a = new AreaCirc(5.6);

    System.out.println(a.area());

    AreaCirc b = new AreaCirc(3.3);
//    AreaCirc.pi = 3.1415926;
     System.out.println(b.area());

        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
    }
}

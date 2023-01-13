package OO.Encapsulamento.A;

public class B {
    A a1 = new A();
    void test(){
        System.out.println(a1.protegido);
        System.out.println(a1.publico);
        System.out.println(a1.what);
    }
}

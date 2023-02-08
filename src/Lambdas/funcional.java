package Lambdas;

@FunctionalInterface
public interface funcional {
// Default methods are allowed only in interfaces.
/* 
# to be a functional interface as defined by the Java Language Specification. 
# Conceptually, a functional interface has exactly one abstract method. 
# Since default methods have an implementation, they are not abstract.
default String legal(){
        return "fkfkf";
    }
    static String mt(){
        // return executar(); -- nao pode chamar uma outro metodo de uma classe static
    }
    */
    double executar(double a,double b);

}

import java.util.*;

public class Overriding {

    public static void main(String[] args) {

        A a1 = new A();
        a1.p(10);
        a1.p(5.5);

    }
}

class B {

    public void p(double i) {
        System.out.println(i * 2);
    }

}

class A extends B {

    //this method overrides the method in B
    public void p(double i) {
        System.out.println(i);
    }

}




public class Overloading {

    public static void main(String[] args) {

        C1 c = new C1();
        C1 newC = new C2();

        c.eat(); // Eating bread
        newC.eat(); // Eating meat
    }

}

class C1 {

    public void eat() {
        System.out.println("Eating bread");
    }
}

class C2 extends C1 {

    public void eat() {
        System.out.println("Eating meat");
    }

}

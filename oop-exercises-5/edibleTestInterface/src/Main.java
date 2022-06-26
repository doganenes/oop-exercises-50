public class Main {

    public static void main(String[] args) {

        Object[] obj = {new Tiger(), new Chicken(), new Apple()};
        for (int i = 0; i < obj.length; i++) {

            if (obj[i] instanceof Edible) {
                System.out.println(((Edible) obj[i]).howToEat());
            }

            if (obj[i] instanceof Animal) {
                System.out.println(((Animal) obj[i]).sound());
            }

        }


    }
}

abstract class Animal {

    private double weight;

    public double getWeight() {

        return weight;

    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract String howToEat();

    public abstract String sound();
}

class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Chicken, fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal {

    @Override
    public String howToEat() {
        return null;
    }

    @Override
    public String sound() {
        return "Tiger: roarr";
    }
}

abstract class Fruit implements Edible {

}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple: make apple cider";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: make orange juice";
    }
}
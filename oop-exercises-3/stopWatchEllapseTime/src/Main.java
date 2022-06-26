public class Main {

    public static void main(String[] args) {

        StopWatch s = new StopWatch();

        int size = 1000000;

        double[] list = new double[size];

        s.start();

        for (int i = 0; i < list.length; i++) {
            list[i] = Math.random() * list.length;
        }

        s.stop();

        System.out.println(s.elapsedTime());

    }
}

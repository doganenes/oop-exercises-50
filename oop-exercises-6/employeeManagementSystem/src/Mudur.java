public class Mudur implements Calisan {

    double ucretSabiti;

    @Override
    public double ucret() {

        return ucretSabiti;
    }

    @Override
    public void calisanBolumu() {
        System.out.println("Yönetici");

    }

    @Override
    public void ucretBelirle(double ucretSabiti) {

        this.ucretSabiti = ucretSabiti;
    }

}

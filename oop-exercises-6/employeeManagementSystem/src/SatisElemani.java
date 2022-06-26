public class SatisElemani implements Calisan {

    double ucretSabiti;
    double komisyon;
    final double komisyonOran = 0.3; // komisyon oranı değiştirilemeyeceğinden final ile belirtildi.

    @Override
    public double ucret() {

        return ((ucretSabiti * oran) + komisyon);
    }

    @Override
    public void calisanBolumu() {

        System.out.println("Satış Elemanı");

    }

    @Override
    public void ucretBelirle(double ucretSabiti) {

        this.ucretSabiti = ucretSabiti;
    }

    public void satisKomisyonuBelirle(int adet) {

        komisyon = adet * komisyonOran;

    }


}

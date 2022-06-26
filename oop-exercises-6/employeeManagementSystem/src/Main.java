public class Main {

    public static void main(String[] args) {
        // işçi özellikleri
        Isci isci1 = new Isci();
        isci1.calisanBolumu();
        isci1.ucretBelirle(900);
        System.out.println("Maaşı: " + isci1.ucret());

        // müdür özellikleri
        Mudur mudur1 = new Mudur();
        mudur1.calisanBolumu();
        mudur1.ucretBelirle(5000);
        System.out.println("Maaşı: " + mudur1.ucret());

        // şatış elemanı özellikleri
        SatisElemani se1 = new SatisElemani();
        se1.calisanBolumu();
        se1.ucretBelirle(1000);

        se1.satisKomisyonuBelirle(300);
        System.out.println("Komisyon: " + se1.komisyon);

        System.out.println("Maaşı: " + se1.ucret());
    }

}

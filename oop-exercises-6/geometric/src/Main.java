public class Main {

    public static void main(String[] args) {

        Daire daire1 = new Daire();
        Dikdortgen dikdortgen1 = new Dikdortgen();
        Ucgen ucgen1 = new Ucgen();

        daire1.bilgi(5);
        System.out.println("Daire nesnesi alan: " + daire1.alanHesap());
        System.out.println(daire1.getIsim());

        dikdortgen1.bilgi(15, 5);
        System.out.println("Dikdörtgen alan: " + dikdortgen1.alanHesap());
        System.out.println(dikdortgen1.getIsim());

        ucgen1.bilgi(15, 5);
        System.out.println("Üçgen alanı: " + ucgen1.alanHesap());
        System.out.println(ucgen1.getIsim()); // nesnenin ismini döndürür GeometrikSekil class'ındaki metot sayesinde.
    }

}

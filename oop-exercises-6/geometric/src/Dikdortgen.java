public class Dikdortgen extends GeometrikSekil {

    private double uzunKenar;
    private double kisaKenar;

    public void bilgi(double uzunKenar, double kisaKenar){

        isimBelirle("Dikdörtgen Nesnesi:");

        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;

    }

    @Override
    public double alanHesap(){

        return uzunKenar * kisaKenar;

    }




}

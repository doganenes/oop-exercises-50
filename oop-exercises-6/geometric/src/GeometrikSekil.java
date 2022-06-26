public abstract class GeometrikSekil {

    private String isim;

    public void isimBelirle(String isim) {

        this.isim = isim;

    }

    public String getIsim(){
        return this.isim;

    }

    public abstract double alanHesap();





}

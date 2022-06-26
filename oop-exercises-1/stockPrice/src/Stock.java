public class Stock {

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {

        this.symbol = symbol;
        this.name = name;

    }

    public void setPrice(double price) {
        this.currentPrice = price;
    }

    public double getChangePercent() {
        return currentPrice;
    }


}

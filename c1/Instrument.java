import java.time.LocalDateTime;

public abstract class Instrument //implements Tradeable, Priceable
{
    private final String symbol;
    private String name;
    private double currentPrice;
    private LocalDateTime lastUpdated;

    public Instrument(String symbol, String name, double currentPrice) {
        // TODO
        this.symbol = symbol;
        this.name = name;
        this.currentPrice = currentPrice;
        this.lastUpdated = LocalDateTime.now();
        //throw new UnsupportedOperationException("TODO");
    }

    public abstract double riskScore();

    public abstract String assetClass();
    
    public void updatePrice(double newPrice) {
        // TODO
        if (newPrice < 0) {
            throw new IllegalArgumentException();
        }
        else {
            this.currentPrice = newPrice;
            this.lastUpdated = LocalDateTime.now();
        }
        //throw new UnsupportedOperationException("TODO");
    }

    public String getSymbol() {
        // TODO
        return this.symbol;
        //throw new UnsupportedOperationException("TODO");
    }

    public String getName() {
        // TODO
        return this.name;
        //throw new UnsupportedOperationException("TODO");
    }

    public double getCurrentPriceValue() {
        // TODO
        return this.currentPrice;
        //throw new UnsupportedOperationException("TODO");
    }

    public LocalDateTime getLastUpdated() {
        // TODO
        return this.lastUpdated;
        //throw new UnsupportedOperationException("TODO");
    }

    @Override
    public String toString() {
        // TODO
        return this.name + "[symbol=" + this.symbol + ", price=" + this.currentPrice + ", risk=";
        //throw new UnsupportedOperationException("TODO");
    }
    public double getPriceChange(double previousPrice) {
        return currentPrice - previousPrice;
    }
    public double getPriceChangePercent(double previousPrice) {
        return ((currentPrice - previousPrice) / previousPrice) * 100;
    }
}

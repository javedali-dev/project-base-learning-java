package unit2.pj22;

public class Cards implements Comparable<Cards>{
    int number;
    String symbol;

    public Cards(int number, String symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "number=" + number +
                ", symbol='" + symbol + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cards cards) {
        return this.symbol.compareTo(cards.symbol);
    }
}

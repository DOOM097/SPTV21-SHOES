package Entity;

import java.util.Date;

public class History {
    private Shoes shoes;
    private Buyer buyer;
    private Date BuyToShoes;

    public History() {
    }

    public Shoes shoes() {
        return shoes;
    }

    public History setShoes(Shoes shoes) {
        this.shoes = shoes;
        return this;
    }

    public Buyer buyer() {
        return buyer;
    }

    public History setBuyer(Buyer buyer) {
        this.buyer = buyer;
        return this;
    }

    public Date BuyToShoes() {
        return BuyToShoes;
    }

    public History setBuyToShoes(Date BuyToShoes) {
        this.BuyToShoes = BuyToShoes;
        return this;
    }

    @Override
    public String toString() {
        return "History{" +
                "shoes=" + shoes +
                ", buyer=" + buyer +
                ", BuyToShoes=" + BuyToShoes +
                '}';
    }
}

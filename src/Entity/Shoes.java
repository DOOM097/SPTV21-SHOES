package Entity;

import java.util.Arrays;

public class Shoes {
    private String shoesName;
    private String quantity;
    private int price;

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Shoes() {
    }

    public String getShoesName() {
        return shoesName;
    }

    public void setShoesName(String shoesName) {
        this.shoesName= shoesName;
    }


    @Override
    public String toString() {
        return "Shoes{" +
                "shoesName='" + shoesName + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price=" + price +
                '}';
    }


}
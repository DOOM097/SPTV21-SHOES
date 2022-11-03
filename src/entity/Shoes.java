package entity;
public class Shoes {
    private String title;
    private String manufacturer;
    private int amountShop;
    private int price;
    public int length;
    public Shoes() {
    }
    public Shoes(String title, String manufacturer, int amountShop, int price) {
        this.title = title;
        this.manufacturer = manufacturer;
        this.amountShop = amountShop;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int getAmountShop() {
        return amountShop;
    }
    public void setAmountShop(int amountShop) {
        this.amountShop = amountShop;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Shoes{" 
                + "title=" + title 
                + ", manufacturer=" + manufacturer 
                + ", amountShop=" + amountShop 
                + ", price=" + price 
                + '}';
    }
    public Object[] getShoesName() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public void setShoesName(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet.");     } 
}

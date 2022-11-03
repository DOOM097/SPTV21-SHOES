package entity;
import java.util.Date;
public class Purchase {
    private Customer customer;
    private Date takeOfShoes;
    private Shoes shoes;
    private int amountCustomer;
    private int priceCustomer;

    public Purchase() {
    }
    public Purchase(Customer customer, Date takeOfShoes, Shoes shoes, int amountCustomer, int priceCustomer) {
        this.customer = customer;
        this.takeOfShoes = takeOfShoes;
        this.shoes = shoes;
        this.amountCustomer = amountCustomer;
        this.priceCustomer = priceCustomer;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Date getTakeOfShoes() {
        return takeOfShoes;
    }
    public void setTakeOfShoes(Date takeOfShoes) {
        this.takeOfShoes = takeOfShoes;
    }
    public Shoes getShoes() {
        return shoes;
    }
    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }
    public int getAmountCustomer() {
        return amountCustomer;
    }
    public void setAmountCustomer(int amountCustomer) {
        this.amountCustomer = amountCustomer;
    }
    public int getPriceCustomer() {
        return priceCustomer;
    }
    public void setPriceCustomer(int priceCustomer) {
        this.priceCustomer = priceCustomer;
    }
    @Override
    public String toString() {
        return "Purchase{" 
                + "customer=" + customer 
                + ", takeOfShoes" + takeOfShoes 
                + ", shoes=" + shoes 
                + ", amountCustomer=" + amountCustomer 
                + ", priceCustomer=" + priceCustomer 
                + '}';
    }
}

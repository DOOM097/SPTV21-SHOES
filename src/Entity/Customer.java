
package Entity;

public class Customer {
    private String firstname;
    private String lastname;
    private String phone;
    private int money;

    public Customer() {
    }

    public Customer(String firstname, String lastname, String phone, int money) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.money = money;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Customer{" 
                + "firstname=" + firstname 
                + ", Lastname=" + lastname 
                + ", phone=" + phone 
                + ", money=" + money 
                + '}';
    }
    
    
}

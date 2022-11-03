package managers;
import entity.Customer;
import entity.Shoes;
import entity.Purchase;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class PurchaseManager {
    private final Scanner scanner;
    private final ShoesManager shoesManager;
    private final CustomerManager customerManager;
    public PurchaseManager() {
        scanner = new Scanner(System.in);
        shoesManager = new ShoesManager();
        customerManager = new CustomerManager();
    }
    public Purchase createPurchase(Shoes[] shoes, Customer[] customers) {
        
        System.out.println("Список покупателей: ");
        customerManager.printListCustomers(customers);
        System.out.println("Выберите номер покупателя из списка: ");
        int numberCustomer = scanner.nextInt(); scanner.nextLine();
       
        System.out.println("Список пар обуви: ");
        shoesManager.printListShoes(shoes);
        System.out.println("Выберите номер пары обуви из списка: ");
        int numberShoes = scanner.nextInt(); scanner.nextLine();
        
        System.out.println("Введите количество покупаемых пар обуви: ");
        int countShoes = scanner.nextInt(); scanner.nextLine();
        
        Purchase purchase = new Purchase();
        purchase.setTakeOfShoes(new GregorianCalendar().getTime());
        purchase.setShoes(shoes[numberShoes - 1]);
        
        purchase.setAmountCustomer(countShoes);
        purchase.setPriceCustomer(shoes[numberShoes - 1].getPrice());
        
        shoes[numberShoes - 1].setAmountShop(shoes[numberShoes - 1].getAmountShop() - countShoes);
        customers[numberCustomer -1].setMoney(customers[numberCustomer -1].getMoney() - countShoes * shoes[numberShoes - 1].getPrice());
        
        return purchase;
    }
}

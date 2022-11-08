package sptv21shoesnemchenko;
import java.util.Arrays;
import java.util.Scanner;
import Entity.Customer;
import Entity.Shoes;
import Entity.Purchase;
import Managers.CustomerManager;
import Managers.ShoesManager;
import Managers.PurchaseManager;

public class App {
     private final Scanner scanner;
    private final CustomerManager customerManager;
    private final PurchaseManager purchaseManager;
    private final ShoesManager shoesManager;
    private Purchase[] purchases;
    private Customer[] customers;
    private Shoes[] shoes;
    
    public App() {
        scanner = new Scanner(System.in);
        customerManager = new CustomerManager();
        purchaseManager = new PurchaseManager();
        shoesManager = new ShoesManager();
        
        purchases = new Purchase[0];
        customers = new Customer[0];
        shoes = new Shoes[0];
    }
    
    public void run(){
        boolean repeat = true;
        do{
            System.out.println("Функции приложения:");
            System.out.println("0. Выход из программы");
            System.out.println("1. Добавить пару обуви");
            System.out.println("2. Список продавемых пар обуви");
            System.out.println("3. Добавить покупателя");
            System.out.println("4. Список зарегистрированных покупателей");
            System.out.println("5. Покупка покупателем обуви");
            System.out.println("6. Оборот магазина за все время работы");
            System.out.println("7. Добавить денег покупателю");
            System.out.print("Выберите номер функции: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task){
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить пару обуви");
                    addShoes(shoesManager.createShoes()) ;
                    break;
                case 2:
                    System.out.println("2. Список продавемых пар обуви");
                    shoesManager.printListShoes(shoes);
                    break;
                case 3:
                    System.out.println("3. Добавить покупателя");
                    addCustomer(customerManager.createCustomer());
                    break;
                case 4:
                    System.out.println("4. Список зарегистрированных покупателей");
                    customerManager.printListCustomers(customers);
                    break;
                case 5:
                    System.out.println("5. Покупка покупателем обуви");
                    addPurchase(purchaseManager.createPurchase(shoes, customers));
                    break;
                case 6:
                    System.out.println("6. Оборот магазина за все время работы");
                    shopMoney();
                    break;
                case 7:
                    System.out.println("7. Добавить денег покупателю");
                    customerManager.addBalance(customers);
                    break;
                default:
                    System.out.println("Выберите номер функции из списка!");
            }
        }while(repeat);
        System.out.println("Пока!");
    }
    
    private void addCustomer(Customer customer){
        customers = Arrays.copyOf(customers, customers.length + 1);
        customers[customers.length - 1] = customer;
    }
     
    private void addShoes(Shoes product){
        shoes = Arrays.copyOf(shoes, shoes.length + 1);
        shoes[shoes.length - 1] = product;
    }
    
    private void addPurchase(Purchase purchase){
        purchases = Arrays.copyOf(purchases, purchases.length + 1);
        purchases[purchases.length - 1] = purchase;
    }
    
    private void shopMoney() {
        int shopMoney = 0;
         for (Purchase purchase : purchases) {
             shopMoney = shopMoney + purchase.getAmountCustomer() * purchase.getPriceCustomer();
         }
        System.out.printf("%nОборот магазина за все время работы: %d eur%n",shopMoney);
        System.out.println();
    }
}



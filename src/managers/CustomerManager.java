package managers;
import entity.Customer;
import java.util.Scanner;
public class CustomerManager {
    private final Scanner scanner;
    public CustomerManager() {
        scanner = new Scanner(System.in);
    }
    public Customer createCustomer() {
        Customer customer = new Customer();
        System.out.print("Введите имя покупателя: ");
        customer.setFirstname(scanner.nextLine());
        System.out.print("Введите фамилию покупателя: ");
        customer.setLastname(scanner.nextLine());
        System.out.print("Телефон: ");
        customer.setPhone(scanner.nextLine());
        System.out.println("Введите количество денег у покупателя: ");
        customer.setMoney(scanner.nextInt());
        return customer;
    }
    public void printListCustomers(Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            System.out.printf("%d. %s  %s. Телефон: %s Деньги: %d%n",
                    i+1,
                    customers[i].getFirstname(),
                    customers[i].getLastname(),
                    customers[i].getPhone(),
                    customers[i].getMoney()
            );
        }
    }
    public void addBalance(Customer[] customers) {
        System.out.println("Список покупателей: ");
        printListCustomers(customers);
        System.out.println("Выберите номер покупателя из списка: ");
        int numberCustomer = scanner.nextInt(); scanner.nextLine();
        System.out.printf("У покупателя %d eur%n",customers[numberCustomer - 1].getMoney());
        System.out.println("Введите сколько добавить денег: ");
        int addBalance = scanner.nextInt(); scanner.nextLine();
        customers[numberCustomer - 1].setMoney(customers[numberCustomer - 1].getMoney() + addBalance);
    }
    
    
    
}

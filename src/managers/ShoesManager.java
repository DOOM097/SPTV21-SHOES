package managers;
import entity.Shoes;
import java.util.Scanner;
public class ShoesManager {
    private final Scanner scanner;
    public ShoesManager() {
        scanner = new Scanner(System.in);
    }
    public Shoes createShoes() {
        Shoes shoes = new Shoes();
        System.out.println("Введите наименование пары обуви: ");
        shoes.setTitle(scanner.nextLine());
        System.out.println("Вводите производителя: ");
        shoes.setManufacturer(scanner.nextLine());
        System.out.println("Введите количество: ");
        shoes.setAmountShop(scanner.nextInt());
        System.out.println("Введите цену: ");
        shoes.setPrice(scanner.nextInt());
        return shoes;
    }
    public void printListShoes(Shoes[] shoes ){
        for (int i = 0; i < shoes.length; i++) {
            System.out.printf("%d. %s Производитель: %s. Количество: %d Цена: %d%n",
                    i+1,
                    shoes[i].getTitle(),
                    shoes[i].getManufacturer(),
                    shoes[i].getAmountShop(),
                    shoes[i].getPrice()
            );
        }
    }
    
}

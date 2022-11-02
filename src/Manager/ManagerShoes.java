package Manager;
import Entity.Shoes;
import java.util.Scanner;

public class ManagerShoes {
    private final Scanner scanner;
    public ManagerShoes() {
        this.scanner = new Scanner(System.in);
    }

    public Shoes addshoes() {
        Shoes shoes = new Shoes();
        System.out.println("Введите название обуви:");
        shoes.setShoesName(scanner.nextLine());
        System.out.println("Введите цену обуви (целыми числами)");
        shoes.setPrice(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Количество пар обуви");
        shoes.setPrice(scanner.nextInt());
        scanner.nextLine();
        return shoes;
    }
    public void printListShoeses(Shoes[] shoes){
        System.out.println("Обувь: ");
        for (int i = 0; i < shoes.length; i++) {
            Shoes product = shoes[i];
            System.out.printf(i+1+": %s"
                    ,product.getShoesName());
        }
        System.out.println();
    }

}
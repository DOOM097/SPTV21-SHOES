package sptv21shoesnemchenko;

import Entity.Buyer;
import Entity.Shoes;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;
import Manager.ManagerBuyer;
import Manager.ManagerShoes;

public class App {

    private Shoes[] shoeses;
    private Buyer[] buyers;
    private final ManagerBuyer managerBuyer;
    private final ManagerShoes managerShoes;

    public App() {
        this.shoeses = new Shoes[0];
        this.buyers = new Buyer[0];
        managerBuyer = new ManagerBuyer();
        managerShoes = new ManagerShoes();

    }

    public void run() throws ParseException {
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Список задач: ");
            System.out.println("1. Выход из программы");
            System.out.println("2. Добавить пару обуви");
            System.out.println("3. Список обуви");
            System.out.println("4. Добавить покупателя");
            System.out.println("5. Список покупателей");
            System.out.println("6. Покупка обуви");
            //System.out.println("7. Оборот магазина");
            System.out.println("7. Выдача денег покупателю");
            int task = scanner.nextInt();
            scanner.nextLine();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            switch (task) {
                case 0:
                    repeat = false;
                    System.out.println("1. Выход из программы");
                    break;
                case 2:
                    System.out.println("2. Добавить пару обуви");
                    this.shoeses = Arrays.copyOf(this.shoeses, this.shoeses.length + 1);
                    this.shoeses[this.shoeses.length - 1] = managerShoes.addshoes();
                    break;
                case 3:
                    System.out.println("3. Cписок обуви");
                    managerShoes.printListShoeses(shoeses);
                    break;
                case 4:
                    System.out.println("4. Добавить покупателя");
                    this.buyers = Arrays.copyOf(this.buyers, this.buyers.length + 1);
                    this.buyers[this.buyers.length - 1] = managerBuyer.createBuyer();
                    break;

                case 5:
                    System.out.println("5. Список покупателей");
                    System.out.println("Список покупателей");
                    managerBuyer.printListBuyers(buyers);
                    break;
                case 6:
                    System.out.println("6. Покупка обуви");
                    System.out.println(" Список покупателей: ");
                    managerBuyer.printListBuyers(buyers);
                    int buy1 = scanner.nextInt();
                    System.out.println(" Список обуви: ");
                    for (int j = 0; j < shoeses.length; j++) {
                        System.out.println(j + 1);
                    }
                    int buy2 = scanner.nextInt();
                    int pur = buyers[buy1 - 1].getCash() - shoeses[buy2 - 1].getPrice();
                    buyers[buy1 - 1].setCash(pur);
                    System.out.println("Остаток на счету " + pur);

                    break;
                case 7:
                    System.out.println("7. Добавление денег покупателю");
                    System.out.println("Выберите покупателя для зачисления mon$y");
                    System.out.println("Список покупателей");
                    managerBuyer.printListBuyers(buyers);
                    int turn = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Сколько денег?");
                    int addMoney = scanner.nextInt();
                    scanner.nextLine();
                    int TotalMoney = buyers[turn - 1].getCash() + addMoney;
                    buyers[turn - 1].setCash(TotalMoney);
                    break;
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        } while (repeat);
        System.out.println("Пока, guys!");
    }

}

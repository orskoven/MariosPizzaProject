import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Order> allOrders = new ArrayList<Order>();
        System.out.println("MARIOS PIZZABAR\n-------------------");
        int orderIdNumber = 0;
        do {
            //Create order choice:
            System.out.println("Create order:\n• Press 1 - Phone Order\n• Press 2 - In House Order");
            int alfonsoOrderChoice = 1;                           //scanner.nextInt();
            if (alfonsoOrderChoice == 1) {
                System.out.println("You choose creating order from phone!");
                Order.showMenuCard();
                allOrders.add(Order.getOrder(orderIdNumber++));

                //Methods

            } else if (alfonsoOrderChoice == 2) {
                System.out.println("You choose creating order from disk (inHouse!");
                Order.showMenuCard();
                allOrders.add(Order.getOrder(orderIdNumber++));

                //Methods

            } else {
                System.out.println("Please press 1 or 2");
            }


        }while (orderIdNumber < 2);


        System.out.println(allOrders);
    }
}

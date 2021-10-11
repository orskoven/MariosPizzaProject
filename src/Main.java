import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("MARIOS PIZZABAR\n-------------------");

        //Create order choice:
        System.out.println("Create order:\n• Press 1 - Phone Order\n• Press 2 - In House Order");
        int alfonsoOrderChoice = 1;                           //scanner.nextInt();

        if (alfonsoOrderChoice == 1){
            PhoneOrder orderPhone = new PhoneOrder(null,0,null);
            System.out.println("You choose creating order from phone!");
            Order.showMenuCard();
            orderPhone.getOrder();

            //Methods

        } else if (alfonsoOrderChoice == 2){
            InHouseOrder orderHouse = new InHouseOrder(null,0,null);
            System.out.println("You choose creating order from disk (inHouse!");
            Order.showMenuCard();
            orderHouse.getOrder();

            //Methods

        }else{
            System.out.println("Please press 1 or 2");
        }


        //InHouseOrder.getOrder();

    }
}

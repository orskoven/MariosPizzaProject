import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("MARIOS PIZZABAR\n-------------------");

        //Create order choice:
        System.out.println("Create order:\n• Press 1 - Phone Order\n• Press 2 - In House Order");
        int alfonsoOrderChoice = 1;                           //scanner.nextInt();

        if (alfonsoOrderChoice == 1){
            System.out.println("You choose creating order from phone!");
            Order.showMenuCard();
            System.out.println("How many pizzas would you like? - please type a number:");
            int pizzaNumbersInOrder = 3;           //scanner.nextInt();
            Pizza[] pizzasInOrder = new Pizza[pizzaNumbersInOrder];
            int i = 0;
            do{
                System.out.println("Please type the pizza number of choice:");
                int pizzaNumberChoice = scanner.nextInt();
                pizzasInOrder[i] = Order.getPizza(pizzaNumberChoice);
                i++;
            } while (i < pizzaNumbersInOrder);
            System.out.println("What is the order name?");
            String orderName = scanner.next();
           PhoneOrder theOrder = new PhoneOrder(pizzasInOrder,1,orderName);
            System.out.println("These are the ordered pizza's:");
            for (Pizza pizza:pizzasInOrder) {
                System.out.println(pizza);
            }

            //Methods

        } else if (alfonsoOrderChoice == 2){
            System.out.println("You choose creating order from disk (inHouse!");
            Order.showMenuCard();

            //Methods

        }else{
            System.out.println("Please press 1 or 2");
        }


        //InHouseOrder.getOrder();

    }
}

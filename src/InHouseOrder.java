import java.util.Scanner;

public class InHouseOrder extends Order {

    public InHouseOrder(Pizza[] pizzas, int orderId, String orderName, int pickupTime) {
        super(pizzas, orderId, orderName, pickupTime);
    }

    @Override
    public void getOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pizzas would you like? - please type a number:");
        int pizzaNumbersInOrder = 3;           //scanner.nextInt();
        Pizza[] pizzasInOrder = new Pizza[pizzaNumbersInOrder];
        int i = 0;
        do {
            System.out.println("Please type the pizza number of choice:");
            int pizzaNumberChoice = scanner.nextInt();
            pizzasInOrder[i] = Order.getPizza(pizzaNumberChoice);
            i++;
        } while (i < pizzaNumbersInOrder);
        System.out.println("What is the order name?");
        String orderName = scanner.next();
        System.out.println("Please type when the wished pickup time is:");
        int pickupTime = scanner.nextInt();
        InHouseOrder theOrder = new InHouseOrder(pizzasInOrder, 1, orderName,pickupTime);
        System.out.println("These are the ordered pizza's:");
        for (Pizza pizza : pizzasInOrder) {
            System.out.println(pizza);
        }
    }
}

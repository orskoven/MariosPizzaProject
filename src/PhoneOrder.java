import java.sql.Timestamp;
import java.util.Scanner;

public class PhoneOrder extends Order {
    private static Pizza[] pizzas;
    public PhoneOrder(Pizza[] pizzas, int orderId, String orderName, Timestamp timeStamp) {
        super(pizzas, orderId, orderName, timeStamp);
    }

    /*
        public static Pizza[] getOrder(int orderIdNumber, Order order) {
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
            order = new PhoneOrder(pizzasInOrder, orderIdNumber, orderName,pickupTime);
            System.out.println("These are the ordered pizza's:");
            for (Pizza pizza : pizzasInOrder) {
                System.out.println(pizza);
            }
            return PhoneOrder.pizzas;
        }
    */
    @Override
    public String toString() {
        return "PhoneOrder{} " + super.toString();
    }
}

import java.util.Scanner;

public class InHouseOrder extends Order {
    private int time;

    public InHouseOrder(String name, int pizzaNumber, Ingrediens[] ingrediens, int price, Pizza[] pizzas, int orderId, String orderName,int time) {
        super(name, pizzaNumber, ingrediens, price, pizzas, orderId, orderName);
        this.time = time;
    }

    @Override
    public static void getOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvor mange pizzaer skal det være?");
        int numberOfPizzas = scanner.nextInt();
        Pizza[] pizzas = new Pizza[numberOfPizzas];
        int i = 0;
        do {
            System.out.println("Hvilken pizza?");
            int pizzaNumberInput = scanner.nextInt();
            pizzas[i] = getPizza(pizzaNumberInput);
            i++;

        } while (pizzas.length > i);

}
}

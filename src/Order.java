import java.util.Arrays;

public abstract class Order extends Pizza{
    private Pizza[] pizzas;
    private int orderId;
    private String orderName;

    public Order(int pizzaNumber, String name, Ingrediens[] ingrediens, int price, Pizza[] pizzas, int orderId, String orderName) {
        super(pizzaNumber, name, ingrediens, price);
        this.pizzas = pizzas;
        this.orderId = orderId;
        this.orderName = orderName;
    }

    //Methods:
    public static void showMenuCard(){
        System.out.println("Menu Card:");
        Pizza [] menuCards = {getPizza(1),getPizza(2),getPizza(3),getPizza(4),getPizza(5),getPizza(6),getPizza(7),getPizza(8),getPizza(9),getPizza(10),getPizza(11),getPizza(12),getPizza(13),getPizza(14)};
        for (Pizza menuCard :menuCards) {
            System.out.println(menuCard);
        }

    }

    public void getOrder(){

    }

    @Override
    public String toString() {
        return "Order{" +
                "pizzas=" + Arrays.toString(pizzas) +
                ", orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}

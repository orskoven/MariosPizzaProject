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

    public void getOrder(){

    }
}

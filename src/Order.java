public abstract class Order extends Pizza{
    private Pizza[] pizzas;
    private int orderId;
    private String orderName;

    public Order(String name, int pizzaNumber, Ingrediens[] ingrediens, int price, Pizza[] pizzas, int orderId, String orderName) {
        super(name, pizzaNumber, ingrediens, price);
        this.pizzas = pizzas;
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public void getOrder(){

    }
}

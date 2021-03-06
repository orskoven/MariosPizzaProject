import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Order {
    private Pizza[] pizzas;
    private int orderId;
    private String orderName;
    private static ArrayList<Order> listOfCurrentOrders = new ArrayList<Order>();
    private static ArrayList<Order> listOfAllOrders = new ArrayList<Order>();
    private static int[] todaysPizzaCounter = new int[15];
    private Timestamp timeStamp;


    public Order(Pizza[] pizzas, int orderId, String orderName, Timestamp timeStamp) {
        this.pizzas = pizzas;
        this.orderId = orderId;
        this.orderName = orderName;
        this.timeStamp = timeStamp;
    }


    //Methods:
    public static void showMenuCard(){
        System.out.println("Menu Card Overview:");
        Pizza [] menuCards = {getPizza(1),getPizza(2),getPizza(3),
                getPizza(4),getPizza(5),getPizza(6),getPizza(7),
                getPizza(8),getPizza(9),getPizza(10),getPizza(11),
                getPizza(12),getPizza(13),getPizza(14)};
        for (Pizza menuCard :menuCards) {
            System.out.println(menuCard);
        }

    }

    public static Pizza getPizza(int inputPizzaNumber) {
        Pizza whatPizza = (inputPizzaNumber == 1) ? new Pizza(1, "Vesuvio", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.OREGANO}, 57) :
                (inputPizzaNumber == 2) ? new Pizza(2, "Amerikaner", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.OKSEFARS, Ingrediens.OREGANO}, 53) :
                        (inputPizzaNumber == 3) ? new Pizza(3, "Cacciatore", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.PEPPERONI, Ingrediens.OREGANO}, 57) :
                                (inputPizzaNumber == 4) ? new Pizza(4, "Carbona", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.KODSAUCE, Ingrediens.SPAGHETTI, Ingrediens.COCKTAILPOLSER, Ingrediens.OREGANO}, 63) :
                                        (inputPizzaNumber == 5) ? new Pizza(5, "Dennis", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.PEPPERONI, Ingrediens.COCKTAILPOLSER, Ingrediens.OREGANO}, 65) :
                                                (inputPizzaNumber == 6) ? new Pizza(6, "Bertil", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.BACON, Ingrediens.OREGANO}, 57) :
                                                        (inputPizzaNumber == 7) ? new Pizza(7, "Silvia", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.PEPPERONI, Ingrediens.RODPEBERLOG, Ingrediens.OLIVEN, Ingrediens.OREGANO}, 61) :
                                                                (inputPizzaNumber == 8) ? new Pizza(8, "Victoria", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.CHAMPIGNON, Ingrediens.OREGANO}, 61) :
                                                                        (inputPizzaNumber == 9) ? new Pizza(9, "Toronfo", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.BACON, Ingrediens.KEBAB, Ingrediens.CHILI, Ingrediens.OREGANO}, 61) :
                                                                                (inputPizzaNumber == 10) ? new Pizza(10, "Capricciosa", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.CHAMPIGNON, Ingrediens.OREGANO}, 61) :
                                                                                        (inputPizzaNumber == 11) ? new Pizza(11, "Hawai", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.ANANAS, Ingrediens.OREGANO}, 61) :
                                                                                                (inputPizzaNumber == 12) ? new Pizza(12, "Le Blissola", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.REJER, Ingrediens.OREGANO}, 61) :
                                                                                                        (inputPizzaNumber == 13) ? new Pizza(13, "Venezia", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.BACON, Ingrediens.OREGANO}, 61)
                                                                                                                : new Pizza(14, "Mafia", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.PEPPERONI, Ingrediens.BACON, Ingrediens.LOEG, Ingrediens.OREGANO}, 61);
        return whatPizza;
    }

    /*
    public static Order getOrder(Pizza[] pizzasInOrder, int orderIdNumber, String orderName, String pickUpTime){
        Order order = new Order(pizzasInOrder, orderIdNumber, orderName, );
        return order;
    }

     */

    public static Order getdOrder(int orderIdNumber, int input) {


        Scanner scanner = new Scanner(System.in);
            System.out.println("How many pizzas would you like? - please type a number:");
            int pizzaNumbersInOrder = scanner.nextInt();
            Pizza[] pizzasInOrder = new Pizza[pizzaNumbersInOrder];
            int i = 0;
            do {
                System.out.println("Please type the pizza number of choice:");
                int pizzaNumberChoice = scanner.nextInt();
                pizzasInOrder[i] = Order.getPizza(pizzaNumberChoice);
                Order.todaysPizzaCounter[pizzaNumberChoice]++;
                i++;
            } while (i < pizzaNumbersInOrder);
            System.out.println("What is the order name?");
            String orderName = scanner.next();
            System.out.println("Please type when the wished pickup time is:");
            String pickupTime = scanner.next();
            Order order = new Order(pizzasInOrder, orderIdNumber, orderName, TimeStampExample.getTimeStamp());

            listOfCurrentOrders.add(order);

            System.out.println("These are the ordered pizza's:");
            for (Pizza pizza : pizzasInOrder) {
                System.out.println(pizza);
                //return order;
            }
            return order;
    }

    public static void getOrderInterface() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MARIOS PIZZABAR\n-------------------");
        int orderIdNumber = 0;
        do {
            //Create order choice:
            System.out.println("Create order:\n??? Press 1 - Phone Order\n??? Press 2 - In House Order\n??? Press 3 - See all orders\n??? Press 4 - pick up order\n??? Press 5 - get today's most ordered pizza");
            int alfonsoOrderChoice = scanner.nextInt();
            if (alfonsoOrderChoice == 1) {
                orderIdNumber++;
                System.out.println("You choose creating order from phone!");
               // Order.showMenuCard();
                getdOrder(orderIdNumber, alfonsoOrderChoice);


                //Methods

            } else if (alfonsoOrderChoice == 2) {
                orderIdNumber++;

                System.out.println("You choose creating order from disk (inHouse!");
                // Order.showMenuCard();
                getdOrder(orderIdNumber, alfonsoOrderChoice);

                //Methods

            } else if (alfonsoOrderChoice == 3) {
                System.out.println("Here is the orders for today");

                for (Order e : listOfCurrentOrders) {
                    System.out.println(e);
                }
                //getdOrder(orderIdNumber, alfonsoOrderChoice);

            } else if (alfonsoOrderChoice == 4) {
                System.out.println("What order do you want to delete, enter the order ID");

                for (Order e : listOfCurrentOrders) {
                    System.out.println(e);
                }

                int orderToRemove = scanner.nextInt();
                /*
                Order order = new Order(null, orderIdNumber, null, null);
                listOfCurrentOrders.set(orderToRemove,order);
                */






               listOfCurrentOrders.removeIf(order -> (order.orderId == orderToRemove ));

               for (Order e : listOfCurrentOrders) {
                    System.out.println(e);
                }

                //listOfCurrentOrders.removeIf(removedOrder -> orderToRemove == orderId);


/*
                counter = 0;
                if (orderToRemove > listOfCurrentOrders.size() ) {
                    listOfCurrentOrders.remove(orderToRemove);
                    counter = counter + 1;
                } else {
                    listOfCurrentOrders.remove(orderToRemove);
                    counter = counter + 1;
                }
*/
            } else if (alfonsoOrderChoice == 5) {
                System.out.println("The most ordered pizza today is: " + Order.getPizza(getIndexOfLargest(todaysPizzaCounter)));





            } else {
                System.out.println("Please press 1, 2, 3 or 4");

            }


        } while (orderIdNumber < 300);

    }
    public static int getIndexOfLargest( int[] array )
    {
        if ( array == null || array.length == 0 ) return -1; // null or empty

        int largest = 0;
        for ( int i = 1; i < array.length; i++ )
        {
            if ( array[i] > array[largest] ) largest = i;
        }
        return largest; // position of the first largest found
    }


    @Override
    public String toString() {
        return "Ordernumber " + this.orderId  +
                "pizzas=" + Arrays.toString(pizzas) +
                ", orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }

}

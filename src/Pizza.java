public class Pizza {
    private int pizzaNumber;
    private String pizzaName;
    private Ingrediens[] ingrediens;
    private int price;

    //Constructor:
    public Pizza(int pizzaNumber, String pizzaName, Ingrediens[] ingrediens, int price) {
        this.pizzaNumber = pizzaNumber;
        this.pizzaName = pizzaName;
        this.ingrediens = ingrediens;
        this.price = price;
    }

    public Pizza getPizza(int inputPizzaNumber){
        Pizza whatPizza = (inputPizzaNumber == 1)?new Pizza(1,"Vesuvio",new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.OREGANO},57):
        (inputPizzaNumber == 2)? new Pizza(2,"Amerikaner",new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.OKSEFARS,Ingrediens.OREGANO},53):
        (inputPizzaNumber == 3)? new Pizza(3,"Cacciatore",new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.PEPPERONI,Ingrediens.OREGANO},57):
        (inputPizzaNumber == 4)? new Pizza(4,"Carbona",new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.KØDSAUCE,Ingrediens.SPAGHETTI,Ingrediens.COCKTAILPØLSER,Ingrediens.OREGANO},63):
        (inputPizzaNumber == 5)? new Pizza(5,"Dennis",new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.PEPPERONI,Ingrediens.COCKTAILPØLSER,Ingrediens.OREGANO},65):
        (inputPizzaNumber == 6)?new Pizza(6,"Bertil",new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.BACON,Ingrediens.OREGANO},57):
        (inputPizzaNumber == 7)?new Pizza(7,"Silvia",new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.PEPPERONI,Ingrediens.RØDPEBERLØG,Ingrediens.OLIVEN,Ingrediens.OREGANO},61):
        (inputPizzaNumber == 8)?new Pizza(8,"Victoria",new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.CHAMPIGNON,Ingrediens.OREGANO},61):
        (inputPizzaNumber == 9)?new Pizza(9,"Toronfo",new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.BACON,Ingrediens.KEBAB,Ingrediens.CHILI,Ingrediens.OREGANO},61):
        (inputPizzaNumber == 10)?new Pizza(10,"Capricciosa",new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.CHAMPIGNON,Ingrediens.OREGANO},61):
        (inputPizzaNumber == 11)?new Pizza(11,"Hawai",new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.ANANAS,Ingrediens.OREGANO},61):
        (inputPizzaNumber == 12)?new Pizza(12,"Le Blissola",new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.REJER,Ingrediens.OREGANO},61):
        (inputPizzaNumber == 13)?new Pizza(13,"Venezia",new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.BACON,Ingrediens.OREGANO},61):
        (inputPizzaNumber == 14)?new Pizza(14,"Mafia",new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.PEPPERONI,Ingrediens.BACON,Ingrediens.LOEG,Ingrediens.OREGANO},61): null;
        return whatPizza;


    }


}



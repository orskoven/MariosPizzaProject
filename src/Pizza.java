public class Pizza {
    private String name;
    private int pizzaNumber;
    private Ingrediens[] ingrediens;
    private int price;

    public Pizza(String name, int pizzaNumber, Ingrediens[] ingrediens, int price) {
        this.name = name;
        this.pizzaNumber = pizzaNumber;
        this.ingrediens = ingrediens;
        this.price = price;
    }

    public Pizza getPizza(int inputPizzaNumber){
        Pizza whatPizza = (inputPizzaNumber == 1)?new Pizza("Vesuvio",1,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.OREGANO},57):
        (inputPizzaNumber == 2)? new Pizza("Amerikaner",2,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.OKSEFARS,Ingrediens.OREGANO},53):
        (inputPizzaNumber == 3)? new Pizza("Cacciatore",3,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.PEPPERONI,Ingrediens.OREGANO},57):
        (inputPizzaNumber == 4)? new Pizza("Carbona",4,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.KØDSAUCE,Ingrediens.SPAGHETTI,Ingrediens.COCKTAILPØLSER,Ingrediens.OREGANO},63):
        (inputPizzaNumber == 5)? new Pizza("Dennis",5,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.PEPPERONI,Ingrediens.COCKTAILPØLSER,Ingrediens.OREGANO},65):
        (inputPizzaNumber == 6)?new Pizza("Bertil",6,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.BACON,Ingrediens.OREGANO},57):
        (inputPizzaNumber == 7)?new Pizza("Silvia",7,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.PEPPERONI,Ingrediens.RØDPEBERLØG,Ingrediens.OLIVEN,Ingrediens.OREGANO},61):
        (inputPizzaNumber == 8)?new Pizza("Victoria",8,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.CHAMPIGNON,Ingrediens.OREGANO},61):
        (inputPizzaNumber == 9)?new Pizza("Toronfo",9,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.BACON,Ingrediens.KEBAB,Ingrediens.CHILI,Ingrediens.OREGANO},61):
        (inputPizzaNumber == 10)?new Pizza("Capricciosa",10,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.CHAMPIGNON,Ingrediens.OREGANO},61):
        (inputPizzaNumber == 11)?new Pizza("Hawai",11,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.ANANAS,Ingrediens.OREGANO},61):
        (inputPizzaNumber == 12)?new Pizza("Le Blissola",12,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.REJER,Ingrediens.OREGANO},61):
        (inputPizzaNumber == 13)?new Pizza("Venezia",13,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.BACON,Ingrediens.OREGANO},61):
        (inputPizzaNumber == 14)new Pizza("Mafia",14,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.PEPPERONI,Ingrediens.BACON,Ingrediens.LOEG,Ingrediens.OREGANO},61);
        return whatPizza;


    }
}



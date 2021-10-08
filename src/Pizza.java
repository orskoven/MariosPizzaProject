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

    public static void main(String[] args) {
        Pizza vesuvio = new Pizza("Vesuvio",1,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.OREGANO},57);
        Pizza amerikaner = new Pizza("Amerikaner",1,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.OKSEFARS,Ingrediens.OREGANO},53);
        Pizza cacciatore = new Pizza("Cacciatore",1,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.PEPPERONI,Ingrediens.OREGANO},57);
        Pizza carbona = new Pizza("Carbona",1,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.KØDSAUCE,Ingrediens.SPAGHETTI,Ingrediens.COCKTAILPØLSER,Ingrediens.OREGANO},63);
        Pizza dennis = new Pizza("Dennis",1,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.PEPPERONI,Ingrediens.COCKTAILPØLSER,Ingrediens.OREGANO},65);
        Pizza bertil = new Pizza("Bertil",1,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.BACON,Ingrediens.OREGANO},57);
        Pizza silvia = new Pizza("Silvia",1,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.PEPPERONI,Ingrediens.RØDPEBERLØG,Ingrediens.OLIVEN,Ingrediens.OREGANO},61);
        Pizza victoria = new Pizza("Victoria",1,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.CHAMPIGNON,Ingrediens.OREGANO},61);
        Pizza toronfo = new Pizza("Toronfo",1,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.BACON,Ingrediens.KEBAB,Ingrediens.CHILI,Ingrediens.OREGANO},61);
        Pizza capricciosa = new Pizza("Capricciosa",1,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.CHAMPIGNON,Ingrediens.OREGANO},61);
        Pizza hawai = new Pizza("Hawai",1,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.ANANAS,Ingrediens.OREGANO},61);
        Pizza leBlissola = new Pizza("Le Blissola",1,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.REJER,Ingrediens.OREGANO},61);
        Pizza venezia = new Pizza("Venezia",1,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.SKINKE,Ingrediens.BACON,Ingrediens.OREGANO},61);
        Pizza mafia = new Pizza("Mafia",1,new Ingrediens[]{Ingrediens.TOMATSAUCE,Ingrediens.OST,Ingrediens.PEPPERONI,Ingrediens.BACON,Ingrediens.LOEG,Ingrediens.OREGANO},61);


    }
}



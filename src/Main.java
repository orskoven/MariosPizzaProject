import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("MARIOS PIZZABAR\n-------------------");

        //Create order choice:
        System.out.println("Create order:\n• Press 1 - Phone Order\n• Press 2 - In House Order");
        int alfonsoOrderChoice = 1;                           //scanner.nextInt();

        if (alfonsoOrderChoice == 1){
            System.out.println("You choose creating order from phone!");

            //Show menuCard method
            //metode

        } else if (alfonsoOrderChoice == 2){
            System.out.println("You choose creating order from disk (inHouse!");

            //Show menuCard method
            //Methods

        }else{
            System.out.println("Please press 1 or 2");
        }


        //InHouseOrder.getOrder();

    }
}

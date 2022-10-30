import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double price = 0;
        double total = 0;
        boolean done = true;

        do {
            price = SafeInputs.getRangedDouble(in, "Enter the price of your item: ", 0.50, 10);
            done = SafeInputs.getYNConfirm(in, "Would you like to enter another item price [Y/N]? ");
            total = total + price;
        }while(done);

        System.out.printf("The total price of your items are: %.2f", total);
    }
}


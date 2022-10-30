import java.util.Scanner;

public class Reggie{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String prompt = "Enter your SSN";
        String ssnPattern = "\\d{3}-\\d{2}-\\d{4}";
        String ssn = SafeInputs.getRegExString(scanner, prompt, ssnPattern);

        String promptTwo = "Enter your M number";
        String mnumber = "\\d{8}";
        String m = SafeInputs.getRegExString(scanner, promptTwo, mnumber);

        String promptThree = "Enter O for open, S for save, V for view, Q for quit";
        String choice = "[OsSsVvQq]";
        String result = SafeInputs.getRegExString(scanner, promptThree, choice);

        System.out.println("");
        System.out.println("Your ssn is this: " + ssn);
        System.out.println("Your M is this: " + m);
        System.out.println("You chose the option: " + result);
    }
}
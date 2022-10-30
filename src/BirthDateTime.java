import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {

        Scanner pipe = new Scanner(System.in);

        int birthYear = SafeInputs.getRangedInt(pipe, "Enter the year that you were born: ", 1950, 2010);

        int birthMonth = SafeInputs.getRangedInt(pipe, "Enter your birthday month in number: ", 1, 12);

        int length = BirthDateTime.getMonthLength(birthMonth);
        int birthDay = SafeInputs.getRangedInt(pipe, "Enter the day that you were born on: ",1, length);

        int birthHour = SafeInputs.getRangedInt(pipe, "Enter the hour you were born on from 1-24: ",1, 24);

        int birthMin = SafeInputs.getRangedInt(pipe, "Enter the minute you were born on from 1-59: ",1, 59);

        System.out.println("You were born on, " + birthMonth + "/" + birthDay + "/" + birthYear + " ,at the hour " + birthHour + " ,on the minute " + birthMin + "!");

    }

    public static int getMonthLength(int birthMonth){
        int length= 0;
        switch (birthMonth) {
            case 1:
                length = 31;
                break;
            case 2:
                length = 28;
                break;
            case 3:
                length = 31;
                break;
            case 4:
                length = 30;
                break;
            case 5:
                length = 31;
                break;
            case 6:
                length = 30;
                break;
            case 7:
                length = 31;
                break;
            case 8:
                length = 31;
                break;
            case 9:
                length = 30;
                break;
            case 10:
                length = 31;
                break;
            case 11:
                length = 30;
                break;
            case 12:
                length = 31;
                break;
            default:
                System.out.println("\n Please enter Valid Number between 1 to 12");

        }
        return length;
    }
}

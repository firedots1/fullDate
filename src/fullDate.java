import java.util.Scanner;

public class fullDate {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the Month?");

        String Month = userInput.nextLine();

        System.out.println("What is the Day?");
        int Day = userInput.nextInt();

        System.out.println("What is the Year?");

        int Year = userInput.nextInt();

        System.out.println("It is " + Month + " " + Day + ", " + Year + ".");

    }
}
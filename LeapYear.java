import java.io.Console;

public class LeapYear {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("This program will tell you how many leap years have occurred since the year you were born. Enter your birth year: ");

    int birthYear = Integer.parseInt(myConsole.readLine());

    System.out.println("You were born in " + birthYear);
  }
}

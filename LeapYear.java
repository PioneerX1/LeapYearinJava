import java.io.Console;

public class LeapYear {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("This program will tell you how many leap years have occurred since the year you were born. Enter your birth year: ");

    int birthYear = Integer.parseInt(myConsole.readLine());

    //System.out.println("You were born in " + birthYear);

    int leapYears = calculateLeapYears(birthYear);
    System.out.println("There have been " + leapYears + " leap years since the year you were born");
  }
  public static int calculateLeapYears(int year) {
    int currentYear = 2017;
    int numberOfLeapYears = 0;

    for (int i = year; i <= currentYear; i++) {
      if (i % 4 == 0) {
        System.out.println(i);
        numberOfLeapYears++;
      }
    }
    return numberOfLeapYears;
  }
}

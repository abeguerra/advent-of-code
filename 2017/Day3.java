import java.util.Scanner;

public class Day3 {
  public static int countSteps(int startingNumber) {
    if (startingNumber == 1) return 0;
    if (startingNumber <= 9) return 1 + (startingNumber% 2);

    int multiplier = 1;
    int curMax = 9;

    while (startingNumber > curMax) {
      curMax += 8*++multiplier;
    }

    int stepCount = 8*multiplier / 4;
    int counter = multiplier;
    int operand = -1;
    
    while (curMax != startingNumber) {
      curMax--;
      stepCount += operand;
      if (--counter == 0) {
        counter = multiplier;
        operand *= -1;
      }
    }
    return stepCount;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number greater than 0:");

    int num;
    while((num = scanner.nextInt()) > 0) {
      System.out.println(num + " -> " + countSteps(num) + " steps");
    }

    System.out.println("You have not followed the rules. You're OUTTA HERE!!!");
    scanner.close();
    System.exit(1);
  }
}
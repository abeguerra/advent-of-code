public class Day1 {
  /* 
   * Day 1: Inverse Captcha
   * 
   * For example:
   *  1122 produces a sum of 3 (1 + 2) because the first digit (1) matches the second digit and the third digit (2) matches the fourth digit.
   *  1111 produces 4 because each digit (all 1) matches the next.
   *  1234 produces 0 because no digit matches the next.
   *  91212129 produces 9 because the only digit that matches the next one is the last digit, 9.
   * 
   * Now, instead of considering the next digit, it wants you to consider the digit halfway around the circular list. That is, if your list contains 10 items, only include a digit in your sum if the digit 10/2 = 5 steps forward matches it. Fortunately, your list has an even number of elements.
   * For example:
   *  1212 produces 6: the list contains 4 items, and all four digits match the digit 2 items ahead.
   *  1221 produces 0, because every comparison is between a 1 and a 2.
   *  123425 produces 4, because both 2s match each other, but no other digit has a match.
   *  123123 produces 12.
   *  12131415 produces 4.
   * 
   */
  public static void main(String[] args) {
    String input = "91212129";
    solveCaptcha(input, 1);
  }

  public static void solveCaptcha1(String input) {
    int sum = 0;

    char[] nums = input.toCharArray();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == (i+1 < nums.length ? nums[i+1] : nums[0])) {
        sum += Character.getNumericValue(nums[i]);
      }
    }
    System.out.println("SUM = " + sum);
  }

  public static void solveCaptcha2(String input) {
    int sum = 0;

    char[] nums = input.toCharArray();
    int stepsAhead = nums.length / 2;
    for (int i = 0; i < stepsAhead; i++) {
      if (nums[i] == nums[i+stepsAhead]) {
        sum += Character.getNumericValue(nums[i])*2;
      }
    }
    System.out.println("SUM = " + sum);
  }

  public static void solveCaptcha(String input, int stepAhead) {
    int sum = 0;
    char[] nums = input.toCharArray();

    for (int i = 0; i < nums.length; i++) {
      int comparisonIndex = nums.length-1 >= i + stepAhead ? i + stepAhead : i + stepAhead - nums.length;
      if (nums[i] == nums[comparisonIndex]) {
        sum += Character.getNumericValue(nums[i]);
      }
    }
    System.out.println("SUM = " + sum);
  }
}
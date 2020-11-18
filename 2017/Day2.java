public class Day2 {
  public static int calculateCheckSum(String[] input) {
    int checkSum = 0;

    for (String i : input) {
      int smallestN = Integer.MAX_VALUE;
      int largestN = Integer.MIN_VALUE;
      for (String n : i.split(" ")) {
        int curN = Integer.parseInt(n);
        smallestN = curN < smallestN ? curN : smallestN;
        largestN = curN > largestN ? curN : largestN;
      }
      checkSum += Math.abs(largestN - smallestN);
    }

    return checkSum;
  }

  public static void main(String[] args) {
    String[] input = {
      "5 1 9 5",
      "7 5 3",
      "2 4 6 8"
    };
    System.out.println(calculateCheckSum(input));
  }
}
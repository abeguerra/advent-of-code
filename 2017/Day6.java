import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Day6 {
  public static String getDistribution(int[] nums) {
    return Arrays.stream(nums)
      .mapToObj(String::valueOf)
      .collect(Collectors.joining(","));
  }

  public static int getMaxIndex(int[] nums) {
    int maxIndex = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[maxIndex] < nums[i]) {
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  public static void redistributeNums(int[] nums) {
    int maxIndex = getMaxIndex(nums);
    int blocksToMove = nums[maxIndex] / (nums.length - 1);
    int blocksRemaining = nums[maxIndex] % (nums.length - 1);
    nums[maxIndex] = 0;

    // reallocate blocks
    if (blocksToMove > 0) {
      for (int i = 0; i < nums.length; i++) {
        if (i == maxIndex) {
          nums[i] += blocksRemaining;
          continue;
        }
        nums[i] += blocksToMove;
      }
      return;
    }
    for (int i = maxIndex + 1; i < nums.length && blocksRemaining > 0; i++, blocksRemaining--) {
      nums[i] += 1;
    }
    for (int i = 0; i < maxIndex && blocksRemaining > 0; i++, blocksRemaining--) {
      nums[i] += 1;
    }
  }

  public static int countRedistributions(int[] nums) {
    int count = 0;
    HashSet<String> knownDistributions = new HashSet<>();

    while (knownDistributions.add(getDistribution(nums))) {
      redistributeNums(nums);
      count++;
    }

    return count;
  }

  public static void main(String[] args) {
    int[] nums = { 0,	5,	10,	0,	11,	14,	13,	4,	11,	8,	8,	7,	1,	4,	12,	11 };
    // int[] nums = { 0, 2, 7, 0 };
    System.out.println(countRedistributions(nums));
    System.out.println(Arrays.toString(nums));
    System.out.println(countRedistributions(nums));
  }

}
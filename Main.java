public class ClimbingStairs2 {

// Recursive function to count distinct ways

public static int countWays(int n) {

// Base cases

if (n == 0) return 1; // reached top

if (n == 1) return 1; // only 1 step left

// Recursive case: 1 step or 2 steps

return countWays(n - 1) + countWays(n - 2);

}

public static void main(String[] args) {

int n = 3; // total stairs

int ways = countWays(n);

System.out.println("Number of distinct ways: " + ways);

}

}

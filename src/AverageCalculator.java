/**
 * Exercise 8 — AverageCalculator
 *
 * Five test scores, all ints. Print the exact average as a decimal.
 *
 * With the scores below the true average is 87.4.
 * If your program prints 87.0, you've hit the integer division trap.
 * Fix it without changing the score variables to doubles.
 */
public class AverageCalculator {
    public static void main(String[] args) {
        int score1 = 88;
        int score2 = 92;
        int score3 = 79;
        int score4 = 95;
        int score5 = 83;

        // Calculate the total
        int total = score1 + score2 + score3 + score4 + score5;

        // Cast total to double to avoid integer division
        double average = (double) total / 5;

        System.out.printf("Average score: %.1f%n", average);
    }
}
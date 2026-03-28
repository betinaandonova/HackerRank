import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Въведи n:");
        int n = sc.nextInt();

        List<Integer> responseTimes = new ArrayList<>();

        System.out.println("Въведи " + n + " числа:");
        for (int i = 0; i < n; i++) {
            responseTimes.add(sc.nextInt());
        }

        int result = Result.countResponseTimeRegressions(responseTimes);
        System.out.println("Резултат: " + result);

        sc.close();
    }
}

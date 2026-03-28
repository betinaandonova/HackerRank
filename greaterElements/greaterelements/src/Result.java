import java.util.List;

public class Result {
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {

        long sum = 0;
        int greaterElementsCount = 0;

        if (responseTimes.size() <= 1) {
            return 0;
        } else {
            sum = responseTimes.get(0);

            for (int i = 1; i < responseTimes.size(); i++) {

                if ((long) responseTimes.get(i) * i > sum) {
                    greaterElementsCount++;
                }

                sum += responseTimes.get(i);
            }
        }

        return greaterElementsCount;
    }
}

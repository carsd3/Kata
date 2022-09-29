import java.util.HashMap;
import java.util.Map;

public class kata2 {
        public static void main(String[] args) {
            Histogram histo = new Histogram(new Integer[] {0, 1, 4, 5, 2, 6, 7, 2, 3, 9, 0, 5, 8, 7, 2});

            Map<Integer, Integer> histogr = histo.getHistogram();

            for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
                System.out.println(entry.getKey() + " ==> " + histogr.get(entry.getKey()));
            }
        }
}

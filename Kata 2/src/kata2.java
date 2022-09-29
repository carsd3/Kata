import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class kata2 {
        public static void main(String[] args) {
            int[] data = {0, 1, 4, 5, 2, 6, 7, 2, 3, 9, 0, 5, 8, 7, 2};

            Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
            for (Integer d : data){
                if (histogram.containsKey(d)) {
                    histogram.put(d, histogram.get(d)+1);
                } else {
                    histogram.put(d, 1);
                }
            }

            for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
                System.out.println(entry.getKey() + " ==> " + histogram.get(entry.getKey()));
            }
        }
}

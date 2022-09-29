import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int[] data;

    public Histogram(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public Map<Integer, Integer> getHistogram() {
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (Integer d : this.data){
            histogram.put(d, histogram.containsKey(d) ? histogram.get(d)+1 : 1);
        }
        return histogram;
    }
}

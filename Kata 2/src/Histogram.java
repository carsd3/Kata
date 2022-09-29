import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    private final T[] data;

    public Histogram(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

    public Map<T, Integer> getHistogram() {
        Map<T, Integer> histogram = new HashMap<T, Integer>();
        for (T d : this.data){
            histogram.put(d, histogram.containsKey(d) ? histogram.get(d)+1 : 1);
        }
        return histogram;
    }
}

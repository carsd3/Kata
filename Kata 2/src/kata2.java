import java.util.HashMap;
import java.util.Map;

public class kata2 {
        public static void main(String[] args) {
            Histogram histo = new Histogram(new String[] {"Jose", "Francisco", "Rosario", "Pepe", "Luis", "Rosario", "Julia", "Hernesto", "Roberto", "Pepe", "Pepe", "Perdomo", "Hernesto", "Domingo", "Rosario"});

            Map<String, Integer> histogr = histo.getHistogram();

            for (Map.Entry<String, Integer> entry : histogr.entrySet()) {
                System.out.println(entry.getKey() + " ==> " + histogr.get(entry.getKey()));
            }
        }
}

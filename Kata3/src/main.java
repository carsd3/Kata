public class main {
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        for (int i=0;i<7;i++) {
            histogram.increment("ulpgc.es");
        }
        for (int i=0;i<4;i++) {
            histogram.increment("dis.ulpgc.es");
        }
        for (int i=0;i<2;i++) {
            histogram.increment("ull.es");
        }
        for (int i=0;i<15;i++) {
            histogram.increment("gmail.com");
        }
        HistogramDisplay h = new HistogramDisplay(histogram);
        h.execute();
    }
}

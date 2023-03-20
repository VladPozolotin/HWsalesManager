public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long truncatedMean() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        long max = this.max();
        long sum = 0;
        int count = 0;
        long mean = 0;
        for (long sale : sales) {
            if (sale != max && sale != min) {
                sum = sum + sale;
                count++;
            }
        }
        if (count != 0) {
            mean = sum / count;
        }
        return mean;
    }
}

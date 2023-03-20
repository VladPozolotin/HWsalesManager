public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int truncatedMean() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        int max = this.max();
        int sum = 0;
        int count = 0;
        int mean = 0;
        for (int sale : sales) {
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

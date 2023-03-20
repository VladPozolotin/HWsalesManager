public class Main {
    public static void main(String[] args) {
        SalesManager sales = new SalesManager(new long[]{100, 400, 0, 999, 321});
        System.out.println(sales.max());
    }
}
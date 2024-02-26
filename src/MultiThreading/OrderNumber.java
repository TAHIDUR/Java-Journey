package MultiThreading;

public class OrderNumber {
    private static int orderNumber;

    public static Integer getOrderNumber() {
        return orderNumber++;
    }
}

import java.math.BigDecimal;

public class Order {
    private final String userId, OrderId;
    private final BigDecimal value;

    public Order(String userId, String orderId, BigDecimal value) {
        this.userId = userId;
        OrderId = orderId;
        this.value = value;
    }
}

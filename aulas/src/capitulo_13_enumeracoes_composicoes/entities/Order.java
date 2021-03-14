package capitulo_13_enumeracoes_composicoes.entities;

import capitulo_13_enumeracoes_composicoes.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public Double total() {
        double sum = 0.0;
        for (OrderItem item : orderItems) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ").append(sdf.format(moment)).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client).append("\n");
        sb.append("Order items: ").append("\n");
        for (OrderItem orderItem : orderItems) {
            sb.append(orderItem.getProduct().getName())
                    .append(", $")
                    .append(orderItem.getProduct().getPrice())
                    .append(", Quantity = ")
                    .append(orderItem.getQuantity())
                    .append(", Subtotal = ")
                    .append(String.format("%.2f", orderItem.subTotal()))
                    .append("\n");
        }
        sb.append("Total price = $").append(total());
        return sb.toString();
    }

}

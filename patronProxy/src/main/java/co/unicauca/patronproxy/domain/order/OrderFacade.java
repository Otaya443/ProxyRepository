package co.unicauca.patronproxy.domain.order;

import co.unicauca.patronproxy.access.IOrderRepository;

/**
 * Fachada que permite acceder a la logica de este subsistema.
 *
 * @author Camilo Otaya, Maria Teresa Trujillo
 */
public class OrderFacade implements IOrderService {

    private Order order;

    public OrderFacade() {
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void createOrder(Customer customer) {
        order = new Order(customer);
    }

    public void addDish(Dish dish, int amount) {
        order.addDish(dish, amount);
    }

    public void changeState(State state) {
        order.setState(state);
    }

    public void cancelOrder() {
        order.setState(State.CANCELLED);
    }

    public double calculateTotal() {
        return order.calculateTotal();
    }

    public int totalDishes() {
        return order.getDetails().size();
    }

    public void save(IOrderRepository repo) {
        repo.createOrder(order);
    }
}

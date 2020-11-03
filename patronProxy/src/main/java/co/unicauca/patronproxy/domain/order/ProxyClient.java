package co.unicauca.patronproxy.domain.order;

import co.unicauca.patronproxy.access.Factory;
import co.unicauca.patronproxy.access.IOrderRepository;

/**
 *
 * @author Camilo Otaya, Maria Teresa Trujillo
 */
public class ProxyClient {

    private IOrderService orderService;

    public ProxyClient(IOrderService orderService) {
        this.orderService = orderService;
    }

    public void createOrder() {
        IOrderRepository repo = Factory.getInstance().getRepository("Default");
        orderService.save(repo);
    }

}


package co.unicauca.patronproxy.access;

import co.unicauca.patronproxy.domain.order.Order;

/**
 *
 * @author Camilo Otaya, Maria Teresa Trujillo
 */
public interface IOrderRepository {

    public void createOrder(Order order);
    
}

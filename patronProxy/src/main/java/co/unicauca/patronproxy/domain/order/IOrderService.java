
package co.unicauca.patronproxy.domain.order;

import co.unicauca.patronproxy.access.IOrderRepository;

/**
 *
 * @author Camilo Otaya, Maria Teresa Trujillo
 * Suejto(subject).
 * 
 * Interfaz que debe ser implementada tanto por los proxy como por los sijetos que realizan la operacion.
 */
public interface IOrderService {
    
    public void save(IOrderRepository repo);
}

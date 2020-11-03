package co.unicauca.patronproxy.access;

/**
 *
 * @author Camilo Otaya, Maria Teresa Trujillo
 */
public class Factory {

    private static Factory instance;

    private Factory() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia IOrderRepository
     *
     * @return una clase hija de la abstracción IOrderRepository
     */
    public IOrderRepository getRepository(String type) {

        OrderRepositoryImplArrays result = null;

        switch (type) {
            case "Default":
                result = new OrderRepositoryImplArrays();
                break;
        }

        return result;

    }

}

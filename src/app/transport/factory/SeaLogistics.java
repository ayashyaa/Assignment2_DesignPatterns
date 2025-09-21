package app.transport.factory;

import app.transport.product.Transport;
import app.transport.product.Ship;

// Конкретный Создатель для Морской логистики
public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        // Factory Method: здесь создается конкретный продукт Ship
        return new Ship();
    }
}
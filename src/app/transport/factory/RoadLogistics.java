package app.transport.factory;

import app.transport.product.Transport;
import app.transport.product.Truck;

// Конкретный Создатель для Дорожной логистики
public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        // Factory Method: здесь создается конкретный продукт Truck
        return new Truck();
    }
}
package app.transport.product;

// Concrete product - Ship
public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Доставка выполнена: по морю в контейнере (Корабль).");
    }
}
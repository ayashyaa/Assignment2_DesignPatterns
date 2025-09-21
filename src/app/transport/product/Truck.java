package app.transport.product;

// Конкретный продукт - Грузовик
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Доставка выполнена: по суше в коробке (Грузовик).");
    }
}
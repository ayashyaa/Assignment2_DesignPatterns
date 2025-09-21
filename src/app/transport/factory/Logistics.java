package app.transport.factory;

import app.transport.product.Transport;

// Абстрактный Создатель (Creator)
// Определяет шаблонный метод planDelivery() и абстрактный фабричный метод createTransport()
public abstract class Logistics {

    // Fabric method. Подклассы решат, какой именно Transport создать.
    public abstract Transport createTransport();

    // Main method, который использует продукт, не зная его конкретного класса.
    public void planDelivery() {
        System.out.println("--- Начинаем планирование доставки... ---");
        Transport t = createTransport();
        t.deliver();
        System.out.println("--- Доставка завершена. ---");
    }
}
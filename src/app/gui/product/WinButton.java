package app.gui.product;

// Concrete object (product) - Windows Button
public class WinButton implements Button {
    @Override
    public void render() {
        System.out.println("GUI: Отрисовываем кнопку в стиле Windows.");
    }
}

package app.gui.product;

// Concrete object (product)- macOS Checkbox
public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("GUI: Отрисовываем флажок в стиле macOS.");
    }
}
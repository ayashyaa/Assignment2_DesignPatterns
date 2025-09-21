package app.gui.product;

// Concrete object (product)- macOS button
public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("GUI: Rendering a button in macOS style.");
    }
}
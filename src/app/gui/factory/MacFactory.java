package app.gui.factory;

import app.gui.product.Button;
import app.gui.product.Checkbox;
import app.gui.product.MacButton;
import app.gui.product.MacCheckbox;

// Concrete Factory macOS
// implements - реализовывают GUIFactory methods
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
package app.gui.factory;

import app.gui.product.Button;
import app.gui.product.Checkbox;
import app.gui.product.WinButton;
import app.gui.product.WinCheckbox;

// Concrete Factory Windows
public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        // We create a Button object that is compatible with Windows
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        // We create a Checkbox that's compatible with Windows
        return new WinCheckbox();
    }
}
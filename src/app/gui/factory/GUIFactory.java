package app.gui.factory;

import app.gui.product.Button;
import app.gui.product.Checkbox;

// Abstract Factory(Interface) is a template/pattern.
// concrete classes will follow the pattern and create Button and Checkbox.

public interface GUIFactory {
    Button createButton();    // Метод для создания объекта Button
    Checkbox createCheckbox(); // Метод для создания объекта Checkbox
}
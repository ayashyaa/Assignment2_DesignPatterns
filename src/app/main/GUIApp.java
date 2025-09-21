package app.main;

// --- ИМПОРТЫ ДЛЯ ABSTRACT FACTORY (GUI) ---
import app.gui.factory.GUIFactory;
import app.gui.factory.MacFactory;
import app.gui.factory.WinFactory;
import app.gui.product.Button;
import app.gui.product.Checkbox;

// --- ИМПОРТЫ ДЛЯ FACTORY METHOD (ЛОГИСТИКА) ---
import app.transport.factory.Logistics;
import app.transport.factory.RoadLogistics;
import app.transport.factory.SeaLogistics;

public class GUIApp {
    private Button button;
    private Checkbox checkbox;

    // Класс для демонстрации GUI
    public GUIApp(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void drawInterface() {
        System.out.println("--- Отрисовка интерфейса ---");
        button.render();
        checkbox.render();
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        System.out.println("           РАЗДЕЛ 1: FACTORY METHOD (ЛОГИСТИКА)      ");


        // 1. Запуск RoadLogistics (создаст объект Truck)
        Logistics roadLogistics = new RoadLogistics();
        System.out.println("Запуск Дорожной логистики:");
        roadLogistics.planDelivery();

        System.out.println("\n----------------------------------\n");

        // 2. Запуск SeaLogistics (создаст объект Ship)
        Logistics seaLogistics = new SeaLogistics();
        System.out.println("Запуск Морской логистики:");
        seaLogistics.planDelivery();

        System.out.println("\n           РАЗДЕЛ 2: ABSTRACT FACTORY (GUI)    ");


        // 3. Запуск GUI в стиле Windows
        GUIFactory winFactory = new WinFactory();
        GUIApp winApp = new GUIApp(winFactory);
        System.out.println("Запуск приложения со стилем Windows:");
        winApp.drawInterface();

        System.out.println("\n----------------------------------\n");

        // 4. Запуск GUI в стиле macOS
        GUIFactory macFactory = new MacFactory();
        GUIApp macApp = new GUIApp(macFactory);
        System.out.println("Запуск приложения со стилем macOS:");
        macApp.drawInterface();

        System.out.println("=========================================");
    }
}
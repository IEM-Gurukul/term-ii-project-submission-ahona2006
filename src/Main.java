import singleton.*;
import factory.*;
import observer.*;
import decorator.*;

public class Main {

    public static void main(String[] args) {

        // Singleton
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.connect();

        // Factory
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape shape = factory.getShape("triangle");
        shape.draw();

        // Observer
        WeatherData wd = new WeatherData();
        DisplayDevice mobile = new DisplayDevice("Mobile");
        wd.addObserver(mobile);
        wd.setTemperature(30);

        // Decorator
        Component c = new ConcreteComponent();
        Component decorated = new FeatureDecorator(c);
        decorated.operation();
    }
}
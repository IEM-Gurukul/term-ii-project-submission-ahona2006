package factory;

public class ShapeFactory {

    private static ShapeFactory instance;

    private ShapeFactory() {}

    public static ShapeFactory getInstance() {
        if (instance == null)
            instance = new ShapeFactory();
        return instance;
    }

    public Shape getShape(String type) {

        switch(type.toLowerCase()) {

            case "circle":
                return new Circle();

            case "rectangle":
                return new Rectangle();

            case "square":
                return new Square();

            case "triangle":
                return new Triangle();

            default:
                return null;
        }
    }
}
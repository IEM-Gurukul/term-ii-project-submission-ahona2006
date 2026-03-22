package decorator;

public class FeatureDecorator extends Decorator {

    public FeatureDecorator(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        System.out.println("Added extra feature");
    }
}
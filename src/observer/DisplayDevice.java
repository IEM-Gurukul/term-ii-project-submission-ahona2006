package observer;

public class DisplayDevice implements Observer {

    private String name;

    public DisplayDevice(String name) {
        this.name = name;
    }

    public void update(float temperature) {
        System.out.println(name + " shows temperature: " + temperature);
    }
}
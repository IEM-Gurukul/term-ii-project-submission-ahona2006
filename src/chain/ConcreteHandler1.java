package chain;

public class ConcreteHandler1 extends Handler {

    public void handle(String request) {

        if(request.equals("Level1"))
            System.out.println("Handled by Level 1");

        else if(next != null)
            next.handle(request);
    }
}
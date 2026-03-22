package chain;

public class ConcreteHandler2 extends Handler {

    public void handle(String request) {

        if(request.equals("Level2"))
            System.out.println("Handled by Level 2");

        else
            System.out.println("Not handled");
    }
}
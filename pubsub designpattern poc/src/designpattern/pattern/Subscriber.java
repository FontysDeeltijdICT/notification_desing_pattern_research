package designpattern.pattern;

public class Subscriber {
    int id;

    public Subscriber(int id) {
        this.id = id;
    }

    // Called when msg is send on subscribed topic
    @OnMessage
    private void onMessage(Message message) {
        System.out.println(id + ") " + message.message);
    }
}
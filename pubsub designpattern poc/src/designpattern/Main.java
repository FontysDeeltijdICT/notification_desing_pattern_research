package designpattern;

import designpattern.pattern.Event;
import designpattern.pattern.Message;
import designpattern.pattern.Subscriber;
import designpattern.threads.SubscriberThread;

public class Main {

    public static void main(String[] args) {
        System.out.println("-- Start --");
        System.out.println(" ");

        // Create sub in same thread
        Subscriber subscriber1 = new Subscriber(1);
        Subscriber subscriber2 = new Subscriber(2);

        // Create sub thread
        SubscriberThread subscriberThread1 = new SubscriberThread();
        subscriberThread1.run();

        // Subscribe to channel
        Event.operation.subscribe("create", subscriber1);
        Event.operation.subscribe("delete", subscriber2);

        // Create msg
        Message message = new Message("Create Action");

        // Send msg on channel
        Event.operation.publish("create", message);
    }
}

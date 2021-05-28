package designpattern.threads;

import designpattern.pattern.*;
import java.util.concurrent.ThreadLocalRandom;

public class SubscriberThread extends Thread {

    public void run() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
        Subscriber subscriber = new Subscriber(randomNum);

        // Sub to create topic
        Event.operation.subscribe("create", subscriber);
    }
}

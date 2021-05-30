package mitchellton.observerexample;

import mitchellton.observerexample.observer.Observer;

public class ObserverImplementation implements Observer {

    String name;

    public ObserverImplementation(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + " updated msg: " + msg);
    }

}

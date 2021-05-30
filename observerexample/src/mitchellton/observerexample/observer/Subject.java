package mitchellton.observerexample.observer;

import mitchellton.observerexample.observer.Observer;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);

}

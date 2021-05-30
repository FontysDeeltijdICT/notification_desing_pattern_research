package mitchellton.observerexample;

import mitchellton.observerexample.observer.Observer;
import mitchellton.observerexample.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class ClassWithStatus implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    private void notifyUpdate(String message) {
        for(Observer observer: observers) {
            observer.update(message);
        }
    }

    public void setStatus(String status) {
        notifyUpdate(status);
    }
}

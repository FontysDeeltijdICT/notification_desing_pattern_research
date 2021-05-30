package mitchellton.observerexample;

public class ObserverInThread extends Thread {

    ClassWithStatus classWithStatus;
    public ObserverInThread(ClassWithStatus classWithStatus) {
        this.classWithStatus = classWithStatus;
    }


    public void run() {
        ObserverImplementation threadObs = new ObserverImplementation("Threaded Observer");
        classWithStatus.attach(threadObs);
    }
}

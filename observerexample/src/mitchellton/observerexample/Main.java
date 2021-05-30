package mitchellton.observerexample;

public class Main {

    public static void main(String[] args) {
        ObserverImplementation obs1 = new ObserverImplementation("observer 1");
        ObserverImplementation obs2 = new ObserverImplementation("observer 2");
        ObserverImplementation obs3 = new ObserverImplementation("observer 3");

        ClassWithStatus classWithStatus = new ClassWithStatus();

        classWithStatus.attach(obs1);
        classWithStatus.attach(obs2);
        classWithStatus.attach(obs3);

        classWithStatus.setStatus("3 normal observers attached.");

        classWithStatus.detach(obs3);

        classWithStatus.setStatus("observer 3 detached.");

        ObserverInThread observerInThread = new ObserverInThread(classWithStatus);
        observerInThread.run();

        classWithStatus.setStatus("observerInThread attached.");
    }
}

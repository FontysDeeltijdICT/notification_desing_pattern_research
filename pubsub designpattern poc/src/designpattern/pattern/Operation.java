package designpattern.pattern;

import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Operation extends Event {

    // Subscriber to topic
    public void subscribe(String topic, Object subscriber) {
        if (!channels.containsKey(topic)) {
            channels.put(topic, new ConcurrentHashMap<>());
        }
        channels.get(topic).put(subscriber.hashCode(), subscriber);
    }

    // Publish msg on topic
    public void publish(String topic, Message message) {
        for(Map.Entry<Integer, Object> subs : channels.get(topic).entrySet()) {
            var subscriber = subs.getValue();
            for (final Method method : subscriber.getClass().getDeclaredMethods()) {
                Annotation annotation = method.getAnnotation(OnMessage.class);
                if (annotation != null) {
                    deliverMessage(subscriber, method, message);
                }
            }
        }
    }

    // Used to deliver msg to subscribed objects
    <T> boolean deliverMessage(T subscriber, Method method, Message message) {
        try {
            boolean methodFound = false;
            for (final Class paramClass : method.getParameterTypes()) {
                if (paramClass.equals(message.getClass())) {
                    methodFound = true;
                    break;
                }
            }
            if (methodFound) {
                method.setAccessible(true);
                method.invoke(subscriber, message);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
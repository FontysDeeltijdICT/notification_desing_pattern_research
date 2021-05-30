# Design Pattern Library Research

## Observer Pattern

With the observer pattern it is possible to monitor an object, called the Subject, by multiple "observer" objects. The Subject only knows there are Observers, and can update them automatically of any changes. The various Observers may be responsible for different actions, of these actions, the Subject doesn't know anything. 

Take a doorbell for example. In the case of a blind person's home, there is the button you press outside your door, the subject. The observers in this case would be both the actual bell that would ring, and the lamps that would flash. The moment the button is pressed, it will send a "message" to the bell and the lamps inside the home. The button doesn't know what happens inside the home. 

## Publish-subscribe Pattern

With the pub-sub pattern, there are the same sort of roles as the Observer pattern. In this case they are called the Publisher(subject) and Subscriber(Observer). But where the subject and observer are communicating directly, the Publisher and Subscriber do not know of each other's existence. Instead of sending messages directly, the Publisher sends the messages to a third component, usually called a broker. This broker sorts the messages and sends them to the correct subscribers. 

Think of a big company in this case. The head of such a company doesn't have the time to write all the emails or make all the phone calls all day. He has a secretary to do this for him. She takes his messages and sorts them, and then sends them to the right people. 

## Comparison

Since the Subject and Observer are aware of each other, making the components more tightly coupled than with the pub-sub pattern. This creates inflexibility and can create problems when expanding and maintaining the code. Because the Publishers and Subscribers don't know of each other, this pattern is a lot more loosely coupled and a lot more scalable. 

While there can be multiple Publishers or Subjects in both these patterns. It is a lot harder to add a second subject. In most cases it would be easier to apply the same observer pattern again, or to switch to the pub-sub patter. 

Since the subject automatically updates all its observers; when an event occurs, the subject will call the appropriate method of all its observers, meaning this pattern is implemented synchronously. In some cases that means that some observers receive irrelevant messages. 

The pub-sub pattern uses the broker to both sort and queue the messages, making it a more efficient, asynchronous implementation, allowing for multiple threads.  

The observer pattern need to be used in a single-application scope whereas the pub-sub pattern can also be implemented in cross application. 

## Conclusion

The Pub-sub pattern is more loosely coupled, which means maintaining and expanding the code will be easier in the future. Since the messages are sorted and send to the correct Subscribers, it is also more efficient, while also allowing for multiple threads.  


### Sources
[Publish-subscribe pattern Wikipedia](https://en.wikipedia.org/wiki/Publish%E2%80%93subscribe_pattern)  
[Observer pattern wikipedia](https://en.wikipedia.org/wiki/Observer_pattern)  
https://betterprogramming.pub/observer-vs-pub-sub-pattern-50d3b27f838c
https://examples.javacodegeeks.com/java-ee-observer-design-pattern-example/

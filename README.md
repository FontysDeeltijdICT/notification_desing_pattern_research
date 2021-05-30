# Design Patterns

In this research experiment we will be comparing the Observer pattern and the Pub-Sub pattern. The work has been divided into some library research, comparing these patterns and two workshops, for each pattern one. 


## Question

*How to handle realtime events in a way allowing for future extensibility in a monolithic application?*

## Sub Question

*What are the possible methods for implementing non distributed event systems?*  
*How to extend your code when using said methods?*  


## Library research conclusion

The Pub-sub pattern is more loosely coupled than the observer pattern, which means maintaining and expanding the code will be easier in the future. Since the messages are sorted and send to the correct Subscribers, it is also more efficient, while also allowing for multiple threads.


## Conclusion

Pub sub wins!
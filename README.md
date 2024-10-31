# Car Price Calculator - Decorator Design Pattern
This repository demonstrates the Decorator Design Pattern using a practical problem: calculating the price of a car with customizable features. By applying the decorator pattern, the code enables flexible and dynamic addition of car features, each with its unique price, without modifying the existing classes.

# Problem Statement:
In this example, a basic car model has a set price. Additional features like a Sunroof, Leather Seats, Sports Package, etc., can increase the car’s price. Each feature is optional, and users can add as many features as they want.

To manage this without an explosion of subclasses, the decorator pattern allows us to add features dynamically at runtime.

# Solution - Decorator Design Pattern
The Decorator Design Pattern provides a way to extend the functionality of an object without altering its structure. This pattern is ideal when we need to add functionalities to individual objects, where these enhancements are not necessarily applicable to all objects of the class.

Key Benefits of Using the Decorator Pattern
1. Flexibility: Features can be added or removed without modifying existing classes.
2. Single Responsibility: Each decorator handles one specific feature, promoting clean, maintainable code.

[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title


---Implementation of Object-Oriented Design Patterns in Java

## Problem Statement (max 150 words)

---This project aims to demonstrate the practical implementation of commonly used object-oriented design patterns in Java. In real-world applications, poor code structure leads to tight coupling, low scalability, and difficulty in maintenance. The problem addressed in this project is how to design a modular, flexible, and reusable system using well-defined design patterns. The application implements multiple patterns such as Singleton, Factory, Observer, Decorator, Strategy, and Chain of Responsibility to solve different types of design problems. Each pattern is implemented with a clear purpose and interaction logic, ensuring better separation of concerns and maintainability. The project helps in understanding how design patterns improve software quality and make systems easier to extend and manage.
## Target User


---Computer Science students,Beginner Java developers,Anyone learning Object-Oriented Design and Design Patterns


## Core Features

- Implementation of multiple design patterns in a single project
- Modular and scalable object-oriented architecture
- Demonstration of real-time behavior like notifications and dynamic object creation

---

## OOP Concepts Used

- Abstraction:Interfaces such as Shape, Observer, and Strategy define common behavior without exposing implementation details.
- Inheritance:Classes like Circle, Square, and Triangle inherit from the Shape interface.
- Polymorphism:Methods like draw() behave differently depending on the object type.
- Exception Handling:Invalid inputs (e.g., wrong shape type) are handled to prevent runtime errors.
- Collections / Threads:ArrayList is used in the Observer pattern to store and manage observers dynamically.

---

## Proposed Architecture Description

---The system follows a modular object-oriented architecture where each design pattern is implemented in a separate component. Interfaces define common behaviors, and concrete classes provide specific implementations, ensuring loose coupling and flexibility. The Main class acts as the entry point and coordinates interactions between different patterns. The Factory pattern handles object creation, the Observer pattern manages state updates and notifications, the Strategy pattern defines interchangeable algorithms, the Decorator pattern dynamically extends functionality, the Singleton pattern ensures a single instance of shared resources, and the Chain of Responsibility pattern processes requests sequentially. This architecture improves maintainability, scalability, and code reusability.

## How to Run

---Install Java
Ensure Java JDK (version 8 or above) is installed on your system.

Verify installation:

java -version
javac -version
Open Project Folder
Open the project in VS Code or any Java IDE (IntelliJ / Eclipse).
Check Folder Structure
Ensure all .java files are placed correctly in their respective packages.
Compile the Code

Open terminal in the project directory and run:

javac Main.java
Run the Program

Execute the program using:

java Main
View Output
The console will display outputs demonstrating:
Singleton instance creation
Factory object creation
Observer updates
Strategy execution
Decorator functionality
Chain of Responsibility handling

## Git Discipline Notes
Minimum 10 meaningful commits required.

# Smart Traffic Signal System (Java OOP Project)

## Overview

The **Smart Traffic Signal System** is a Java-based simulation that dynamically adjusts traffic signal timings based on real-time traffic density. Unlike traditional fixed-timer systems, this project uses Object-Oriented Programming (OOP) principles and strategy-based logic to optimize traffic flow.

---

## Problem Statement

Traditional traffic signals operate on fixed time intervals, which leads to:

* Unnecessary waiting on empty roads
* Traffic congestion on busy roads
* Inefficient fuel usage and time loss

This project solves the problem by:

* Calculating traffic density dynamically
* Allocating green signal time based on demand
* Supporting different traffic strategies

---

## Features

* Dynamic traffic signal timing
* Density-based decision making
* Strategy-based control (Normal / Heavy Traffic)
* Clean OOP design
* User input-based simulation
* Scalable for multiple roads

---

## OOP Concepts Used

| Concept       | Implementation                               |
| ------------- | -------------------------------------------- |
| Encapsulation | Private variables in `TrafficSignal`, `Road` |
| Inheritance   | `Vehicle → Car, Bike, Truck`                 |
| Polymorphism  | `ControlStrategy` interface                  |
| Abstraction   | Abstract class `Vehicle`                     |
| Interface     | `ControlStrategy`                            |

---

## Project Structure

```
Traffic-System/
│
├── Main.java
├── Vehicle.java
├── Car.java
├── Bike.java
├── Truck.java
├── Road.java
├── TrafficSignal.java
├── ControlStrategy.java
├── NormalStrategy.java
├── HeavyTrafficStrategy.java
├── SignalController.java
```

---

## How It Works

1. User inputs:

   * Number of roads
   * Road names
   * Number and type of vehicles

2. System:

   * Calculates weighted traffic density
   * Applies selected strategy
   * Determines optimal green signal time

3. Output:

   * Displays signal timing for each road

---

## How to Run

### Prerequisites

* Java JDK (8 or above)
* Any IDE (VS Code / IntelliJ / Eclipse)

---

### Steps

1. Clone the repository:

```
git clone https://github.com/your-username/traffic-system.git
```

2. Navigate to project folder:

```
cd traffic-system
```

3. Compile all files:

```
javac *.java
```

4. Run the program:

```
java Main
```

---

## Sample Input

```
Enter number of roads: 2

Enter road name: A
Enter number of vehicles on road A: 2
Enter vehicle type: car
Enter vehicle type: truck

Enter road name: B
Enter number of vehicles on road B: 1
Enter vehicle type: bike

Choose strategy (1: Normal, 2: Heavy Traffic): 1
```

---

## Sample Output

```
Road A Density: 3.2 → GREEN for 16 seconds
Road B Density: 1.2 → GREEN for 12 seconds
```

---

## Future Enhancements

* Emergency vehicle priority system
* Real-time simulation using threads
* Graphical User Interface (JavaFX)
* AI-based traffic prediction
* Traffic analytics dashboard

---

## Learning Outcomes

* Practical implementation of OOP concepts
* Understanding of real-world system design
* Experience with Java project structuring
* Hands-on GitHub version control

---

## Author

**Hardik Jain - 24BAI10355**
B.Tech AIML, VIT Bhopal

---

## 📜 License

This project is for academic purposes.

---

⭐ If you found this project useful, consider giving it a star!

# Smart Traffic Signal System (Java OOP Project)

## Overview

The **Smart Traffic Signal System** is a Java-based simulation project that dynamically adjusts traffic signal timings based on traffic density. Unlike traditional fixed-timer systems, this project optimizes signal duration using object-oriented programming principles.

---

## Problem Statement

Conventional traffic signals operate on fixed time intervals, which leads to:

* Traffic congestion on busy roads
* Unnecessary waiting time on empty roads

This project solves the problem by:

* Analyzing vehicle density
* Allocating green signal time dynamically
* Simulating real-world traffic scenarios

---

## Features

* Dynamic traffic signal timing
* Multiple road handling (junction simulation)
* Traffic density-based decision making
* Scalable and modular design
* Implementation of core OOP concepts

---

## OOP Concepts Used

| Concept       | Implementation                                            |
| ------------- | --------------------------------------------------------- |
| Encapsulation | Private variables in classes like `TrafficSignal`, `Road` |
| Inheritance   | `Vehicle → Car, Bike, Truck`                              |
| Polymorphism  | `ControlStrategy` interface                               |
| Abstraction   | Strategy-based signal control                             |
| Interface     | `ControlStrategy`                                         |

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
├── SignalController.java
```

---

## How It Works

1. User inputs:

   * Number of roads
   * Number of vehicles per road

2. System:

   * Calculates traffic density
   * Applies control strategy
   * Assigns green signal time

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

3. Compile:

```
javac *.java
```

4. Run:

```
java Main
```

---

## Sample Input

```
Enter number of roads: 2
Enter road name: A
Enter number of vehicles: 5
Enter road name: B
Enter number of vehicles: 3
```

---

## Sample Output

```
Road A GREEN for 20 seconds
Road B GREEN for 16 seconds
```

---

## Future Enhancements

* Emergency vehicle priority system
* Real-time simulation with delays
* Traffic analytics dashboard
* GUI using JavaFX
* AI-based traffic prediction

---

## Learning Outcomes

* Applied real-world problem solving
* Strong understanding of OOP concepts
* Hands-on experience with Java project structure
* GitHub version control practice

---

## Author

**Hardik Jain - 24BAI10355**
B.Tech AIML, VIT Bhopal

---

## 📜 License

This project is for academic purposes.

---

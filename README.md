# Project Overview

This repository contains multiple Java classes that demonstrate various programming concepts, patterns, and functionalities. Below is a detailed explanation of each class and its purpose.

---

## Classes and Their Purpose

### 1. `Sheep` Class
- **Purpose**: Solves the problem of determining the last number a sheep counts before it has seen all digits (0-9) at least once in its multiples.
- **Key Features**:
  - Handles multiple test cases.
  - Tracks digits seen using a `Map`.
  - Outputs results in the format "Case #X: result".
  - Returns "INSOMNIA" if the input number is `0`.

---

### 2. `Insomnia_test` Class
- **Purpose**: Implements similar logic to the `Sheep` class but with a different approach.
- **Key Features**:
  - Uses an integer array to track digits instead of a `Map`.
  - Extracts digits using arithmetic operations (`%` and `/`).
  - Outputs results directly without formatting.

---

### 3. `Test` Class
- **Purpose**: Demonstrates various Java concepts and functionalities.
- **Key Features**:
  - Implements `Cloneable` and `Comparable` interfaces.
  - Demonstrates cloning, sorting, and polymorphism.
  - Uses collections (`List`, `Set`, `Map`) and generics.
  - Demonstrates lambda expressions, streams, and exception handling.
  - Explores inheritance and method overriding.

---

### 4. `TestStringCaching` Class
- **Purpose**: Benchmarks the performance of string generation with and without caching.
- **Key Features**:
  - Compares the performance of creating new `String` objects versus reusing cached strings.
  - Uses a `Map` to store and reuse string objects.
  - Highlights the benefits of caching for performance optimization.

---

### 5. `StreamTest` Class
- **Purpose**: Demonstrates the use of Java Streams for various operations.
- **Key Features**:
  - Shows how to generate, transform, and manipulate streams.
  - Demonstrates operations like filtering, mapping, reducing, and sorting.
  - Explores primitive streams (`IntStream`, `LongStream`, `DoubleStream`).
  - Reads files as streams and handles exceptions.

---

### 6. `Singleton` Class
- **Purpose**: Implements the Singleton design pattern.
- **Key Features**:
  - Uses double-checked locking to ensure thread-safe lazy initialization.
  - Ensures only one instance of the class is created.

---

### 7. `ExceptionInheritance` Class
- **Purpose**: Demonstrates method overloading and overriding in the context of exceptions.
- **Key Features**:
  - Explores polymorphism with parent and child classes.
  - Handles different types of arguments and exceptions in overridden methods.
  - Highlights how inheritance affects method resolution.

---

## Key Concepts Covered
- Object-Oriented Programming (OOP)
- Java Streams and Functional Programming
- Design Patterns (Singleton)
- Exception Handling and Inheritance
- Performance Optimization (String Caching)
- Collections and Generics

---

## How to Run
1. Clone the repository to your local machine.
2. Open the project in an IDE like IntelliJ IDEA.
3. Navigate to the desired class and run the `main` method to see the output.

---

## Prerequisites
- Java Development Kit (JDK) 8 or higher.
- An IDE or text editor for Java development.

---

## Purpose
This repository serves as a learning resource for Java developers to explore and understand various programming concepts and techniques.

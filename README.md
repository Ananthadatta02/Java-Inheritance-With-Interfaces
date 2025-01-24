# Java Inheritance Guide with Interfaces

This document provides a detailed explanation of inheritance, its types, interfaces in Java, and why multiple inheritance is not possible with classes. Additionally, it includes detailed explanations and steps for the three provided code examples.

---

## **1. What is Inheritance?**
Inheritance is one of the core principles of Object-Oriented Programming (OOP). It allows a class (child or subclass) to inherit properties and methods from another class (parent or superclass). This promotes code reusability and simplifies code management.

### **Types of Inheritance in Java:**
1. **Single Inheritance:**
   - A child class inherits from a single parent class.
   
2. **Multi-Level Inheritance:**
   - A child class inherits from a parent class, and another class inherits from this child class, forming a chain.

3. **Hierarchical Inheritance:**
   - Multiple child classes inherit from a single parent class.

4. **Multiple Inheritance (Not supported with classes in Java):**
   - A class cannot inherit from multiple parent classes in Java because of the Diamond Problem.

The Diamond Problem occurs when two parent classes have methods with the same name, causing ambiguity for the child class about which method to inherit.
However, Java supports multiple inheritance through interfaces, as they only provide method declarations (or default implementations) and require the implementing class to define the behavior explicitly. This eliminates ambiguity and makes multiple inheritance possible.

---

## **2. What is an Interface?**
An interface in Java is a blueprint of a class that contains abstract methods (methods without a body). It can also include default methods and static methods.

### **Key Points about Interfaces:**
- Interfaces support multiple inheritance.
- All methods in an interface are implicitly `public` and `abstract` (until Java 8).
- A class implements an interface using the `implements` keyword.

### **Why Multiple Inheritance is Not Possible with Classes**
Multiple inheritance with classes can lead to ambiguity known as the **Diamond Problem.** If two parent classes define methods with the same name, the child class cannot determine which method to inherit, leading to conflicts. Interfaces avoid this issue by requiring implementation of the methods explicitly in the child class.

---

## **3. Code Examples with Explanations**

### **Example 1: Single-Level Inheritance**
```java
package interface_with_inheritance;

interface Sample1 {
    void test1();
}

interface Sample2 extends Sample1 {
    void test2();
}

class Demo1 implements Sample2 {

    @Override
    public void test1() {
        System.out.println("Test1 Method");
    }

    @Override
    public void test2() {
        System.out.println("Test2 Method");
    }
}

public class Single_Level {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.test1();
        d.test2();
    }
}
```
#### Explanation:
1. **Interfaces:** `Sample1` defines the `test1()` method, while `Sample2` extends `Sample1` and adds the `test2()` method.
2. **Implementation:** `Demo1` implements `Sample2`, providing concrete definitions for both methods.
3. **Execution:** In the `Single_Level` class, an instance of `Demo1` calls both methods.

### Steps to Run:
1. Save the file as `Single_Level.java`.
2. Compile the file: `javac Single_Level.java`.
3. Run the program: `java Single_Level`.

---

### **Example 2: Multi-Level Inheritance**
```java
package interface_with_inheritance;

interface Sample3 {
    void test1();
}

interface Sample4 extends Sample3 {
    void test2();
}

interface Sample5 extends Sample4 {
    void test3();
}

class Demo2 implements Sample5 {

    @Override
    public void test1() {
        System.out.println("Test1 Method..");
    }

    @Override
    public void test2() {
        System.out.println("Test2 Method..");
    }

    @Override
    public void test3() {
        System.out.println("Test3 Method..");
    }
}

public class Multi_Level {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.test1();
        d.test2();
        d.test3();
    }
}
```
#### Explanation:
1. **Interfaces:** `Sample3` defines `test1()`. `Sample4` extends `Sample3` and adds `test2()`. `Sample5` extends `Sample4` and adds `test3()`.
2. **Implementation:** `Demo2` implements `Sample5`, providing definitions for all three methods.
3. **Execution:** In the `Multi_Level` class, an instance of `Demo2` invokes all three methods.

### Steps to Run:
1. Save the file as `Multi_Level.java`.
2. Compile the file: `javac Multi_Level.java`.
3. Run the program: `java Multi_Level`.

---

### **Example 3: Hierarchical Inheritance**
```java
package interface_with_inheritance;

interface Sample6 {
    void test1();
}

interface Sample7 extends Sample6 {
    void test2();
}

interface Sample8 extends Sample6 {
    void test3();
}

class Demo3 implements Sample7 {

    @Override
    public void test1() {
        System.out.println("Test1 method..");
    }

    @Override
    public void test2() {
        System.out.println("Test2 method..");
    }
}

class Demo4 implements Sample8 {

    @Override
    public void test1() {
        System.out.println("Test1 method..");
    }

    @Override
    public void test3() {
        System.out.println("Test3 method..");
    }
}

public class Hirarchial_Level {
    public static void main(String[] args) {
        Demo3 d1 = new Demo3();
        Demo4 d2 = new Demo4();
        d1.test1();
        d1.test2();
        d2.test1();
        d2.test3();
    }
}
```
#### Explanation:
1. **Interfaces:** `Sample6` defines `test1()`. `Sample7` and `Sample8` both extend `Sample6`, adding `test2()` and `test3()`, respectively.
2. **Implementation:** `Demo3` implements `Sample7`, while `Demo4` implements `Sample8`.
3. **Execution:** In the `Hirarchial_Level` class, instances of `Demo3` and `Demo4` call their respective methods.

### Steps to Run:
1. Save the file as `Hirarchial_Level.java`.
2. Compile the file: `javac Hirarchial_Level.java`.
3. Run the program: `java Hirarchial_Level`.

--- 

# How to Clone the Repository
## To clone this repository to your local machine, follow these steps:

Open your terminal or command prompt.
Run the following command:
```bash
git clone https://github.com/Ananthadatta02/Java-Inheritance-With-Interfaces.git  
```

## Navigate to the cloned directory:
``` bash
cd Java-Inheritance-With-Interfaces  
```
Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).

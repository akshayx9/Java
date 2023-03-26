package Assignments.shapes;

/*Problem Statement 1: Declaring and using constructors

Create a class Circle.java in a package “Assignments.shapes”,
add a float instance variable radius and add a default constructor (Constructor 1) for the class.
This constructor should initialize the radius to a default value 1.5f. 

The above constructor should be invoked from a main method from another class, Shape.java (in different package com.java2learn. geometry). 

Problem Statement 2: Overloading constructors and using “this” keyword.

In the Circle.java class created above add an instance float variable pi and create two overloaded constructors.

Constructor 2- with a float argument name radius. The constructor should initialize the class variable radius  with the method argument radius.

NOTE: The instance variable and the method argument should be named same as “radius”.

Constructor 3- with two float arguments radius and pi. Default the class pi value to 3.5 and set the instance variable with the radius method argument.

The constructor “constructor 2” should be invoked from a main method from class, Area.java (in a package Assignment.shapes). 

Problem Statement 4: Create two methods and calculate area and circumference of a Circle

In the Circle.java class, create two methods as listed below

    • Method 1 - calculateCircleArea should accept the float radius as parameter and calculate the area (pi*r*r). It should return the result value to the main method where it should be printed in the console.
    • Method 2 - calculateCircumference should accept float radius as parameter and calculate the circumference (2 * pi * r). It should return the result value to the main method where it should be printed in the console.

Call these two methods from the main method in Circle.java by passing appropriate parameters.
*/

public class Assignment5_1_Circle {
    public float radius;
    float pi=3.5f;
    public Assignment5_1_Circle(){
        radius=1.5f;
        System.out.println(radius);
    }
    public Assignment5_1_Circle(float radius){
        this(10.0f,3.5f);
        this.radius=radius;
    }
    public Assignment5_1_Circle(float radius, float pi){
        this.radius=radius;
        this.pi=3.5f;
    }
    public float calculateCircleArea(float radius) {
        float area=radius*pi*radius;
        return area;
    }
    public float calculateCircumference(float radius) {
        float circumference=2*pi*radius;
        return circumference;
    }
    public static void main(String[] args) {
        Assignment5_1_Circle ci=new Assignment5_1_Circle();
        System.out.println(ci.calculateCircleArea(10));
        System.out.println(ci.calculateCircumference(10));
    }
}

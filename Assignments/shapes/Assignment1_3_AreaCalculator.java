package Assignments.shapes;

/*Problem Statement: 3
Develop a class “Rectangle” inside a package “Assignments.shapes”.
The class should have a method called calculateArea() 
which should print a message “The Area of the rectangle is calculated using the formula length * breadth”.
Develop another class “AreaCalculator” inside the package “Assignments.shapes” add a main method which invokes the calculateArea of the rectangle object.
Output: The following message should be displayed in the console
“The Area of the rectangle is calculated using the formula length * breadth” */

public class Assignment1_3_AreaCalculator extends Assignment1_3_Rectangle {
    public static void main(String[] args) {
        Assignment1_3_AreaCalculator ac=new Assignment1_3_AreaCalculator();
        ac.calculateArea();
    }
}

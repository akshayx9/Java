package Assignments.tax;

/*Assignment 2 contd..

Problem Statement 5: Execute the methods
Develop another class “EmployeeTax”  inside the package “Assignments.tax” add a main method which sets the values and invoke the following methods in the TaxCalculator object.
Test Case 1:  Specify the following values and run the main method
    • Set  the value of citizenship as true, basicSalary as 25000.
    • Invoke the methods calculateTax(), deductTax(), validateSalary().
Output:  The following messages should be displayed in the console
The Tax of the employee  for  the   25000 is 7500
The nett salary of the employee 17500
The salary and citizenship eligibility:  false
Test Case 2:  Specify the following values and run the main method
    • Set  the value of citizenship as true, basicSalary as 125000.
    • Invoke the methods calculateTax(), deductTax(), validateTax().
Output:  The following messages should be displayed in the console
The Tax of the employee  for  the   125000 is 37500
The nett salary of the employee 87500
The salary and citizenship eligibility:  true */

public class Assignment2_EmployeeTax extends Assignment2_TaxCalculator{
    public static void main(String[] args) {
        //Test Case 1
        Assignment2_EmployeeTax et1=new Assignment2_EmployeeTax();
        et1.citizenship=true;
        et1.basicSalary=25000;
        et1.calculateTax();
        et1.deductTax();
        et1.validateSalary();

        //Test Case 2
        Assignment2_EmployeeTax et2=new Assignment2_EmployeeTax();
        et2.citizenship=true;
        et2.basicSalary=125000;
        et2.calculateTax();
        et2.deductTax();
        et2.validateSalary();
    }
}

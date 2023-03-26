package Assignments.tax;

/*Scenario: Developers need to develop a tax calculator for calculating tax using arithmetic, relational and logical operators.

Problem Statement 1: Declaring instance variables.
Develop a class “TaxCalculator” inside a package “Assignments.tax”. 
The class should have an instance float variable named “basicSalary” and a boolean variable  named “citizenship”. 

Problem Statement 2: Usage of Arithmetic operators.
In the TaxCalculator class create a method named calculateTax() that should calculate and print the tax, 
the tax should  be calculated as follows tax = 30*basic salary/100

NOTE: The value stored in the instance variable” basicSalary” should be used in the above calculation.
The calculated tax needs to be stored in another instance float variable “tax”.

This method will display the following message in the console.
“The Tax of the employee  for  the   <basic Salary> is <tax>”

Problem Statement 3: How to type cast?
In the TaxCalculator class create a method named deductTax() method this should reduce the tax calculated in problem statement 1 from  the basic salary and store it in a  instance int variable named  “nettSalary”.

NOTE:  Ensure to use casting for converting float to int.

This method will also display the following message in the console.
“The nett salary of the employee” <nettSalary>

Problem Statement 4: Usage of relational operator
In the TaxCalculator class create a method named validateSalary() method should display a message as below if the basicSalary is greater than 1 lakh and citizenship is true.
“The salary and citizenship eligibility:  ” <response>
<response> - The value would be printed as true if basic salary > 1 lakh and citizenship is true.
The value would be printed as false for other conditions.
*/

public class Assignment2_TaxCalculator {
    float basicSalary;
    boolean citizenship;
    float tax;
    public void calculateTax() {
        tax=30*basicSalary/100;
        System.out.println("The Tax of the employee for the Basic Salary: "+basicSalary+" is "+tax);        
    }
    public void deductTax() {
        float dt=basicSalary-tax;
        int nettSalary=(int)dt;
        System.out.println("The nett salary of the employee:"+nettSalary);
    }
    public void validateSalary() {
        if(basicSalary>100000 && citizenship==true){
            System.out.println("The salary and citizenship eligibility: True");
        }else{
            System.out.println("The salary and citizenship eligibility: False");
        }
    }
}

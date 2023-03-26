package Assignments;

public class Assignment6_Salary extends Assignment6_Employee{
    public static void main(String[] args) {
        double managerSalary,traineeSalary;
        Assignment6_Employee m=new Assignment6_Employee(101, "Suresh", "Hyderabad",89898989);
        managerSalary=m.basicSalary(60000.00);
        System.out.println("Manager Salary: "+managerSalary);
        
        Assignment6_Employee t=new Assignment6_Employee(219,"Ramesh", "Delhi", 90909090);
        traineeSalary=t.basicSalary(30000.00);
        System.out.println("Trainee Salary: "+traineeSalary);
}
}

package oops.others.Constructor;

public class Student {
    String name;
    int age;
    int rollNo;
    Student(){
        System.out.println("No-arg Constructor");
        name="Suresh";
        age=10;
        rollNo=100;
    }         
    Student(String pname,int page,int prollNo){
        System.out.println("Param Constructor");
        name=pname;
        age=page;
        rollNo=prollNo;
    }                  
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.rollNo);
        System.out.println("***************");

        Student s1=new Student("Ramesh", 12, 200);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
    }
}

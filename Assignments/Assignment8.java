package Assignments;

public class Assignment8 {
    public double calculateTax(String empName, Boolean isIndian, double empSal) {
        double taxAmount;
        if(isIndian==false){
            Assignment8_1 ex=new Assignment8_1("CountryNotValidException: The employee should be an Indian citizen for calculating tax");
            throw ex;
        }else if (empName==null || empName.length()==0){
            Assignment8_1 e=new Assignment8_1("EmployeeNameInvalidException: The employee name cannot be empty");
            throw e;
        }else if(empSal>100000 && isIndian==true){
            taxAmount=empSal*8/100; 
        }else if(empSal>50000 && isIndian==true){
            taxAmount=empSal*6/100;
        }else if(empSal>30000 && isIndian==true){
            taxAmount=empSal*5/100;
        }else if(empSal>10000 && isIndian==true){
            taxAmount=empSal*4/100;
        }else{
            Assignment8_1 ne=new Assignment8_1("TaxNotEligibleException: The employee does not need to pay tax");
            throw ne;
        }
        return taxAmount;       
    }

    public static void main(String[] args) {
        Assignment8 ct=new Assignment8();

        try{
        System.out.println("Tax amount is " + ct.calculateTax("Ramesh", false, 34000));
        }catch(Assignment8_1 ex){
            System.out.println("CountryNotValidException: The employee should be an Indian citizen for calculating tax");
        }
        try{
        System.out.println("Tax amount is " + ct.calculateTax("Suresh", true, 1000));
        }catch(Assignment8_1 ne){
            System.out.println("TaxNotEligibleException: The employee does not need to pay tax");
        }
        System.out.println("Tax amount is " + ct.calculateTax("Praveen", true, 55000));
        try{
        System.out.println("Tax amount is " + ct.calculateTax(null, true, 30000));
        }catch(Assignment8_1 e){
            System.out.println("EmployeeNameInvalidException: The employee name cannot be empty");
        }
    }
}

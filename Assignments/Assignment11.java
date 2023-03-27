package Assignments;

public class Assignment11 {
    int ex;
    public double calculateFeesStructure(long studentId, char studentGrade, double monthlyFees, boolean isScholarshipEligible) {
        double fees;
        if(studentId!=0 && studentGrade=='A' && isScholarshipEligible==true){
            fees=monthlyFees-(monthlyFees*10/100);
            ex=10;
            return fees;
        }else if(studentId!=0 && studentGrade=='B' && isScholarshipEligible==true){
            fees=monthlyFees-(monthlyFees*8/100);
            ex=8;
            return fees;
        }else if(studentId!=0 && studentGrade=='C' && isScholarshipEligible==true){
            fees=monthlyFees-(monthlyFees*6/100);
            ex=6;
            return fees;
        }else if(studentId!=0 && studentGrade=='D' && isScholarshipEligible==true){
            fees=monthlyFees-(monthlyFees*4/100);
            ex=4;
            return fees;
        }else{
            System.out.println("Not Eligible for Exemption");
            return monthlyFees;
        }
    }
    public void compareMarks(long maths, double english) {
        Double d1=Double.valueOf(english);
        Long l=Long.valueOf(maths);
        int e1=d1.intValue();
        int m1=l.intValue();
        if(e1>m1){
            System.out.println("English mark is higher than Maths");
        }else if(m1>e1){
            System.out.println("Maths mark is higher than English");
        }else{
            System.out.println("Both are Equal");
        }
    }
    public static void main(String[] args) {
        Assignment11 cf=new Assignment11();
        Double d=Double.valueOf(cf.calculateFeesStructure(234, 'C', 600, false));
        int fees1=d.intValue(); 
        System.out.println("The calculated fees is "+fees1); 

        cf.compareMarks(85, 65);
        cf.compareMarks(56, 98);
        cf.compareMarks(84, 84);
    }
}

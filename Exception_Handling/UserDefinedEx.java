package Exception_Handling;

import java.util.Scanner;

public class UserDefinedEx {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int bal=s.nextInt();
        s.close();
        if(bal<500){
            InsufficientBalEx ex=new InsufficientBalEx("Your account balance is low");
            throw ex;
        }else{
            System.out.println("Balance-->"+bal);
        }
    }
}

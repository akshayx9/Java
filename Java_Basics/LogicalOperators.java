class LogicalOperators {
public static void main(String[] args) {
    {
        int x=10;
    int y=15;
    if(++x>10 && ++y<15){
        ++x;
    }else{
            ++y;
        }
    System.out.println("&&:"+x+" "+y);//output of && operator
    }
    {
        int a=10;
        int b=15;
        if(++a>10 || ++b<15){
            ++a;
        }else{
            ++b;
        }
    System.out.println("||:"+a+" "+b);//output of || operator
    }
        }
}    

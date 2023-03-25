package Exception_Handling;

public class InsufficientBalEx extends RuntimeException {
    public InsufficientBalEx(String message){
        super(message);
    }
}

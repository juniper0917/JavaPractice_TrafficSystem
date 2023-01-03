package Exception;

public class MyException extends RuntimeException {
    MyException(){}
    MyException(String msg){
        super(msg);
    }
}

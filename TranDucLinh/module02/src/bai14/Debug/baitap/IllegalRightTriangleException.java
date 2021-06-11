package bai14.Debug.baitap;

public class IllegalRightTriangleException extends Exception{
    String errorMessage;
    public IllegalRightTriangleException(String inErrorMessage) {
        errorMessage = inErrorMessage;
    }

    public String getString(){
        return errorMessage;
    }
}

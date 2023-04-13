package Q2;
import java.io.IOException;

class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}

public class Exceptions {
    public static void main(String[] args) {
        try {
            // throw an ExceptionA
            throw new ExceptionA("This is an ExceptionA.");
        } catch (Exception exception) {
            System.out.println("Caught an exception: " + exception.getMessage());
        }

        try {
            // throw an ExceptionB
            throw new ExceptionB("This is an ExceptionB.");
        } catch (Exception exception) {
            System.out.println("Caught an exception: " + exception.getMessage());
        }

        try {
            // throw a NullPointerException
            String s = null;
            s.length();
        } catch (Exception exception) {
            System.out.println("Caught an exception: " + exception.getMessage());
        }

        try {
            // throw an IOException
            throw new IOException("This is an IOException.");
        } catch (Exception exception) {
            System.out.println("Caught an exception: " + exception.getMessage());
        }
    }
}
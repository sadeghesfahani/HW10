package Q3;

public class Rethrow {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            // catch the exception and rethrow it
            throw e;
        }
    }

    public static void someMethod2() throws Exception {
        // simulate an exception being thrown
        throw new Exception("Exception thrown in someMethod2");
    }
}
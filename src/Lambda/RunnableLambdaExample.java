package Lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        /**
         * old Java
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable 1");
            }
        };
        new Thread(runnable).start();


        /**
         * Java 8 approach
         */
        new Thread(() -> System.out.println("inside runnable 2")).start();

    }
}

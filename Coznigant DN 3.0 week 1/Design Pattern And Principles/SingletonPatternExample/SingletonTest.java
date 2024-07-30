public class SingletonTest {
    public static void main(String[] args) {
        // Get the instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages using both instances
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Verify that both instances are the same
        if (logger1 == logger2) {
            System.out.println("Logger is a singleton. Both instances are the same.");
        } else {
            System.out.println("Logger is not a singleton. Instances are different.");
        }
    }
}

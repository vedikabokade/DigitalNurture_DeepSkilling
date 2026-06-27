public class SingletonTest {
    public static void main(String[] args) {

        // Get Logger instance
        Logger logger1 = Logger.getInstance();
        logger1.log("Application Started");

        // Get Logger instance again
        Logger logger2 = Logger.getInstance();
        logger2.log("User Logged In");

        // Check whether both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Different Logger instances exist.");
        }
    }
}

//output:
// Logger instance created.
// Log: Application Started
// Log: User Logged In
// Only one Logger instance exists
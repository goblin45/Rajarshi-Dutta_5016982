class Logger {
    private static Logger logger;

    private Logger() {
        System.out.println("Logger created");
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}

public class Main {
    public static void main(String[] args) {
        // Obtain two instances of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Check if both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("logger1 and logger2 refer to different instances.");
        }
    }
}

/*

Output: 

Logger created
Both logger1 and logger2 refer to the same instance.

*/
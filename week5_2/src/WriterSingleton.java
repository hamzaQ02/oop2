
public class WriterSingleton {
    private static WriterSingleton instance;
    private final Writer writer;

    private WriterSingleton() {
        // Initialize the writer object
        writer = new Writer();
    }

    public static WriterSingleton getInstance() {
        synchronized (WriterSingleton.class) {
            if (instance == null) {
                instance = new WriterSingleton();
            }
        }
        return instance;
    }

    public void write(String message) {
        writer.write(message);
        
    }
}





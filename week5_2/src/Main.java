
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Create a thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(100);

        // Call the writer object 100 times concurrently
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                WriterSingleton.getInstance().write("Hello singleton!");
            });
        }

        // Shutdown the thread pool
        executorService.shutdown();
    }
}

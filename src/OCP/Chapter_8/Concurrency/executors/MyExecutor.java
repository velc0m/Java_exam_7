package OCP.Chapter_8.Concurrency.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/**
 * Created by Litvv on 18.08.2016.
 */
public class MyExecutor implements Executor {

    @Override
    public void execute(Runnable command) {
        command.run();
    }

    public void execute(Callable command) {
        try {
            command.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

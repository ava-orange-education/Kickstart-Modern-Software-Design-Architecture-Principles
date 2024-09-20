import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class TaskManagerBenchmark {

    private TaskManager taskManager;

    @Setup
    public void setup() {
        taskManager = new TaskManager();
    }

    @Benchmark
    public void benchmarkAddTask() {
        taskManager.addTask("Benchmark Task");
    }

    @Benchmark
    public void benchmarkUpdateTask() {
        taskManager.addTask("Benchmark Task 1");
        taskManager.addTask("Benchmark Task 2");
        taskManager.updateTask(1, "Updated Benchmark Task");
    }

    @Benchmark
    public void benchmarkDeleteTask() {
        taskManager.addTask("Benchmark Task 1");
        taskManager.addTask("Benchmark Task 2");
        taskManager.deleteTask(1);
    }

    @Benchmark
    public void benchmarkListTasks() {
        taskManager.addTask("Benchmark Task 1");
        taskManager.addTask("Benchmark Task 2");
        taskManager.listTasks();
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}


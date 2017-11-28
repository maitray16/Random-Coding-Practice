/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.pool;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.ArrayList;
/**
 *
 * @author maitrayshah
 */
public class ThreadPool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new PotatoPeelingTask(3));
        tasks.add(new PotatoPeelingTask(6));
        tasks.add(new CoffeeMakingTask(4));
        tasks.add(new CoffeeMakingTask(2));
        tasks.add(new CoffeeMakingTask(6));
        tasks.add(new PotatoPeelingTask(5));
        tasks.add(new CoffeeMakingTask(4));
        tasks.add(new PotatoPeelingTask(3));
        tasks.add(new CoffeeMakingTask(2));
        tasks.add(new PotatoPeelingTask(3));
        tasks.add(new CoffeeMakingTask(3));
        
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=0; i<tasks.size(); i++)
        {
            Runnable worker = new Worker(tasks.get(i));
            executor.execute(worker);
        }
        executor.shutdown();
        while(!executor.isTerminated())
        {
            Thread.yield();
        }

        }
}

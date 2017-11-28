package thread.pool;
import java.lang.System.*;


public class Worker implements Runnable {
    
     
      private final Task task;
    
      public Worker(final Task task) {
        this.task = task;
      }
    
      @Override
      public void run() {
        System.out.println("{} processing {}" + Thread.currentThread().getName() + task.toString());
       
        try {
          Thread.sleep(task.getTimeMs());
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
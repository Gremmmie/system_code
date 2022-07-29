package thread;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author Gremmie102
 * @date 2022/7/29 9:12
 * @purpose :
 */
class MyTask {
    //任务要干啥
    private Runnable command;
    //任务啥时候干
    private long time;//time越大,优先级越大

    public MyTask(Runnable command,long after){
        this.command = command;
        //此处记录的时间是一个绝对的时间戳,不是"多长时间之后能职系那个"
        this.time = System.currentTimeMillis() + after;
    }

    //执行任务的方法,直接在内部调用Runnable的run方法即可
    public void run(){
        command.run();
    }
}


//创建一个自己的定时器类
class MyTimer{
    //使用优先级队列来保存若干个任务
    //阻塞队列:带有线程安全,拥有阻塞的特性
    private PriorityBlockingQueue<MyTask> queue;

    //command 要执行的任务是啥
    //after 多长时间之后来执行这个任务
    public void schedule(Runnable command,long after){
        MyTask myTask = new MyTask(command,after);
        queue.put(myTask);
    }
}

public class Demo23 {
}

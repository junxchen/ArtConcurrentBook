package chapter09;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * ����:
 *
 * @author junxi.chen
 * @create 2019-05-07 10:22
 */
public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(5);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, queue);
        System.out.println(pool.getActiveCount());
        for(int i=0; i<15; i++){
            MyTask myTask = new MyTask(i);
            pool.execute(myTask);
            System.out.println("�̳߳��е��߳���Ŀ��"+pool.getPoolSize()+",�����еȴ�ִ�е�����������"+pool.getQueue().size()+",��ִ�����������Ŀ��"+pool.getCompletedTaskCount());

        }
        pool.shutdown();
    }


    static class MyTask implements Runnable{

        private int taskNum;

        public MyTask(int num){
            this.taskNum = num;
        }

        public void run(){
            System.out.println("����ִ��task " + taskNum);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task "+taskNum+"ִ�����");
        }

    }
}

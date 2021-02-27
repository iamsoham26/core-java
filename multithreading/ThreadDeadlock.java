package multithreading;

import multithreading.*;

/* In Java, a deadlock is a situation where minimum two 
* threads are holding the lock on some different resource, 
* and both are waiting for other’s resource to complete its task.
* And, none is able to leave the lock on the resource it is holding.
*/


//To resolve this issue in Thread block-1 change the order of access from a2b to b2a.
//So that both thread will have same order of access ad won't have any issue.
public class ThreadDeadlock {
    public static void main(String[] args) {
        ThreadDeadlock deadlock = new ThreadDeadlock();

        final DeadlockA a = new DeadlockA();
        final DeadlockB b = new DeadlockB();

        Runnable block1 = new Runnable() {
            @Override
            public void run() {
                synchronized(a) {
                    //add sleep so that both thread can start trying to lock the resource
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized(b) {
                        System.out.println("In Block-1");
                    }
                }
            }
        };

        Runnable block2 = new Runnable() {
            @Override
            public void run() {
                synchronized(b) {
                    //Thread 2 have resource B but also need resource A
                    synchronized(a){
                        System.out.println("In Block-2");
                    }
                }
            }
        };

        new Thread(block1).start();
        new Thread(block2).start();
    }

}
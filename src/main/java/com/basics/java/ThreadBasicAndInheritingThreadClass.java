package com.basics.java;

/*
 * MAIN Thread is responsible to run main method
 * MultiTasking: 
 *  - Process based: Executing several tasks simultaneously where each task is separate process. Best suitable as OS level
 *  - Thread based: Executing several tasks simultaneously where each task is separate independent part of same program and each independent part is called thread. Best suitable for program level
 * Thread based multitasking is used to improve performance and response time of the system.
 * Tomcat thread count by default is 60
 * Java provides inbuilt support for multithreading with inbuilt api (Thread , Runnable, ThreadGroup)
 * Thread: Flow of execution or lightweight process. Separate flow of execution. Each thread has a separate jobs
 * Ways of defining thread:
 * - By extending thread class, No chance of extending any other class. Missing the inheritance benefit
 * - By implementing Runnable interface: Best way to define.
 * Thread scheduler: Responsible for order of execution for threads. Algorithm of thread scheduler varies from JVM. Hence order of execution cannot be guaranteed (Round Robin, FCFS, Shortest Job First etc) 
 * start method activities:
 *  - Register thread with thread scheduler
 *  - Perform other mandatory activities
 *  - Invoke run method
 * Overloading of run method is possible but thread.start method will always call the no arg method to execute
 * If we are not over-riding run method then no output is received as Thread class run method has empty implementation. It wont give any error but this is the bad practice as it doesnt suffice multithreading concept
 * Start method can be overridden but then no new thread will be created and no job implementation will be done as start method will be implemented as normal method call
 * Thread Life-Cycle (Basic):
 * - New/Born state: ThreadDemo t = new ThreadDemo(); i.e Thread instantiation
 * - Ready/Runnable: t.start() makes thread ready/runnable
 * - Running: When thread scheduler allocates processor to start the thread
 * - Dead: If run method completes
 * 
 * */
public class ThreadBasicAndInheritingThreadClass {
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo(); // Thread instantiation. Main thread creates child thread
        // Main thread starts child thread. This will run the job defined in child thread
        t.start(); // Separate thread will be created responsible to execute the job
        //t.start(); // IllegalThreadStateException: RunTime exception
        //t.run(); // No separate thread wont be created as this is the normal method execution and main thread executes the run method
        //t.run(1); // Overloaded method
        //ThreadNoRunMethod t1 = new ThreadNoRunMethod();
        //t1.run();  // No output as run method is not overloaded and super class run method i.e. Thread class run method has no implementation. Bad Practice
        //ThreadStartMethod t2 = new ThreadStartMethod();
        //t2.start(); // No new thread created and it doesn't implement the run method as New thread is not created it self. This is just a normal method call
        for (int i = 0; i < 2; i++) {
            System.out.println("main thread");
        }
    }
}

class ThreadDemo extends Thread {
    public void run() {
        // Code inside run method is the job for the thread
        for (int i = 0; i < 2; i++) {
            System.out.println("child thread");
        }
    }
    
    public void run(int i) {
        System.out.println("Overloaded methods " + i);
    }
}

class ThreadNoRunMethod extends Thread {
    
}

class ThreadStartMethod extends Thread {
    // Bad practice. As multithreading concept is not used
    public void start() {
        //super.start(); // This will create a new thread and implement the run method defined below
        System.out.println("Overridden start method");
    }
    
    public void run() {
        System.out.println("Overriddedn run method");
    }
}
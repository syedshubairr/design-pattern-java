package org.example.singleton.simple;

/**
 * This is for the singleton lazy but with MULTI-THREADING case.
 * so basically what if the class is being accessed by multiple threads at the same time, then in the IF-block
 * if 2 threads get entered on the same time it will create 2 new objects instead of 1. that will defy the meaning of SINGLETON PATTERN.
 */
public class LazySingletonMultiThreaded {
    private static LazySingletonMultiThreaded lazySingletonMultiThreaded;

    private LazySingletonMultiThreaded() {
    }

    /**
     * Option 1. use the synchronized block only on the object creation block, so that other logic in that code can be accessed by multiple threads
     * if not needed to be thread safe.
     */
    public static LazySingletonMultiThreaded createLazySingletonMultithreaded() {
        synchronized (LazySingletonMultiThreaded.class) {
            if (lazySingletonMultiThreaded == null) {
                lazySingletonMultiThreaded = new LazySingletonMultiThreaded();
            }
        }
        return lazySingletonMultiThreaded;
    }

    /**
     * Option 2. use synchronized method, but this will make the whole method to be accessed by only 1 thread and with that it will take more time,
     * because what if the other code in the method is not needed to be thread safe, like if the other code is even accessed by multiple threads than is no problem.
     */
//    public static synchronized LazySingletonMultiThreaded createLazySingletonMultithreaded() {
    // some other code
    // using this option, the OTHER CODE will also one-thread at a time, but if this is not necessary like other threads can execute the
    // OTHER CODE that using the synchronized method is not necessary, because it will make unnecessary wait for the other threads.
//        if (lazySingletonMultiThreaded == null) {
//            lazySingletonMultiThreaded = new LazySingletonMultiThreaded();
//        }
    // some other code
//        return lazySingletonMultiThreaded;
//}
}

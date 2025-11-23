package creational.singletonpattern;

public class LazySingletonThreadSafe {

    private static volatile LazySingletonThreadSafe instance = null;

    private LazySingletonThreadSafe() {}

    /**
     * This is a thread-safe implementation of the lazy singleton pattern using double-checked locking.
     * @return LazySingletonThreadSafe instance
     */
    public static LazySingletonThreadSafe getInstance() {
        if(instance == null) {
            synchronized(LazySingletonThreadSafe.class) {
                if(instance == null) {
                    instance = new LazySingletonThreadSafe();
                }
            }
        }
        return instance;
    }

}

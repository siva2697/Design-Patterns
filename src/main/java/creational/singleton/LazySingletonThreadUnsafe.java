package creational.singleton;

public class LazySingletonThreadUnsafe {

    private static LazySingletonThreadUnsafe instance;

    private LazySingletonThreadUnsafe() {
        // Private constructor to prevent instantiation
    }

    /**
     * Get the single instance of LazySingletonThreadUnsafe.
     * @return The singleton instance.
     */
    public static LazySingletonThreadUnsafe getInstance() {
        if(instance == null) {
            instance = new LazySingletonThreadUnsafe();
        }
        return instance;
    }

}

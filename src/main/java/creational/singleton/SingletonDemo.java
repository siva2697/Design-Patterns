package creational.singleton;

public class SingletonDemo {

    public static void testEagerSingleton() {

        Runnable task = () -> {
            EagerSingleton instance = EagerSingleton.getInstance();
            System.out.println("EagerSingleton Instance HashCode: " + instance.hashCode());
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();

    }



    public static void testLazySingletonThreadUnsafe() {

        Runnable task = () -> {
            LazySingletonThreadUnsafe instance = LazySingletonThreadUnsafe.getInstance();
            System.out.println("LazySingletonThreadUnsafe Instance HashCode: " + instance.hashCode());
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();

    }

    public static void testLazyThreadSafeSingleton() {

        Runnable task = () -> {
            LazySingletonThreadSafe instance = LazySingletonThreadSafe.getInstance();
            System.out.println("LazySingletonThreadSafe Instance HashCode: " + instance.hashCode());
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();
    }

    public static void main(String[] args) {

        System.out.println("1a. Testing Eager Singleton:");
        testEagerSingleton();
        System.out.println("1b. Testing Eager Singleton Completed.\n");

        System.out.println("2a. Testing Lazy Thread-Safe Singleton:");
        testLazyThreadSafeSingleton();
        System.out.println("2b. Testing Lazy Thread-Safe Singleton Completed.\n");

        System.out.println("3a. Testing Lazy Thread-Unsafe Singleton:");
        testLazySingletonThreadUnsafe();
        System.out.println("3b. Testing Lazy Thread-Unsafe Singleton Completed.\n");
    }
}

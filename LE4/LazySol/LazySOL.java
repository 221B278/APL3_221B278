public class LazySOL {
    private static LazySOL instance;
    private static int counter = 0;

    private LazySOL() {
        counter++; 
    }

    public static LazySOL getInstance() {
                if (instance == null) {
                    instance = new LazySOL();
                }
        return instance;
    }

    public static int getCounter() {
        return counter;
    }

}

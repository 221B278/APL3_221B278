public class EagerSOL {
    private static final EagerSOL instance = new EagerSOL();
    private static int counter = 0; 

    private EagerSOL() {
        counter++; 
    }

    public static EagerSOL getInstance() {
        return instance;
    }

    public static int getCounter() {
        return counter;
    }
}

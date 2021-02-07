public class synchronizedSingleton {
    private static volatile synchronizedSingleton unique;

    private synchronizedSingleton(){
    }

    public static synchronizedSingleton getInstance(){
        if(unique==null) {
            synchronized (synchronizedSingleton.class) {
                if (unique == null) unique = new synchronizedSingleton();
                else return unique;
            }
        }
        return unique;
    }
}

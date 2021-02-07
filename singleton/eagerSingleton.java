public class eagerSingleton {
    private static eagerSingleton unique=new eagerSingleton();

    private eagerSingleton(){
    }

    public static eagerSingleton getInstance(){
        return unique;
    }
}

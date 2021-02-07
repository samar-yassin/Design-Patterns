public class lazyIntializationSingleton {

    private static lazyIntializationSingleton unique;

    private lazyIntializationSingleton(){
    }

    public static lazyIntializationSingleton getInstance(){
        if(unique==null)
            unique=new lazyIntializationSingleton();
        return unique;
    }

}

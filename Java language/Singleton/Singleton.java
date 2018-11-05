public class Singleton {
    private static volatile Singleton singleton = null;

    private Singleton(){}

    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                    System.out.println("New Singleton!");
                }
            }
        }
        return singleton;
    }

    public void showMessage(){
        System.out.println("Test Singleton!");
    }
}
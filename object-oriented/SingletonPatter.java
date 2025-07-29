//Ensure that only one instance of a class exists in the entire application


public class Singleton{
    private static Singleton instance = null;
    private Singleton(){}
    public static Synchronized Singleton getInstance{
        if(instance == null){
            return new Singleton();
        }
        return instance;
    }
}
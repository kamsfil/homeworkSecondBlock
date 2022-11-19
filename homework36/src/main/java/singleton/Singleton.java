package singleton;

public class Singleton {

    private static Integer count = 0;

    private static Singleton singleton = new Singleton();

    private Singleton () {
    }

    public static Singleton getInstance(){
        count++;
        return singleton;
    }

    public Integer getCount(){
        return count;
    }
}

package pl.sda.creational.singleton;

public enum SingletonLogger {
    INSTANCE;
    public void log(String text){
        System.out.println(text);
    }

    public static SingletonLogger getInstance() {
        return INSTANCE;
    }
}

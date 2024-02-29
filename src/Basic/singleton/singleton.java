package Basic.singleton;

public class singleton {
//    can only create one object

    private singleton(){}

    public static singleton instance;

    public static singleton getInstance(){
        if(instance == null){
            instance = new singleton();
        }
        return instance;
    }
}

package Basic.generics;

public class classes<t> {
    t i;
    public void in(t i){
        this.i = i;
    }
    public t out(){
        return i;
    }

    public static void main(String[] args) {
        classes<String> c1 = new classes<>();
        c1.in("2f");
        System.out.print(c1.out());
    }
}

package Basic.generics;

public class classes<t,y> {
    t i;
    y j;

    public classes(t i, y j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return "classes{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    public void in(t i){
        this.i = i;
    }
    public t out(){
        return i;
    }

    public static void main(String[] args) {
        classes<String,Integer> c1 = new classes<>("2ff2",455);
//        c1.in("2f");
        System.out.println(c1.out());
        System.out.println(c1);
    }
}

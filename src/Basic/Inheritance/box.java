package Basic.Inheritance;

public class box {
    double l;
    double b;
    double h;

    box(){
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }
    box(double x){
        this.l = x;
        this.b = x;
        this.h = x;
    }
    public box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    box(box o){
        this.l = o.l;
        this.b = o.b;
        this.h = o.h;
    }
    public String toString() {
        return "box{" +
                "l=" + l +
                ", b=" + b +
                ", h=" + h +
                '}';
    }
    
    public void information(){
        System.out.println("Box is currently running " + this);
    }
}

package Basic.Inheritance;

public class boxWeight extends box{
    double weight;
    boxWeight(){
        super();
        this.weight = -1;
    }
    public boxWeight(boxWeight old){
        super(old);
        this.weight = old.weight;
    }
    public boxWeight(double l, double b, double h, double weight) {
        super(l, b, h);// start the constructer of 3 args box
        this.weight = weight;
    }
    public String toString() {
        return "box{" +
                "l=" + l +
                ", b=" + b +
                ", h=" + h +
                ", w=" + weight +
                '}';
    }
}

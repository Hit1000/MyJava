package Basic.Inheritance;

public class boxPrize extends boxWeight{
    double cost;
    public boxPrize() {
        super();
        this.cost = -1;
    }
    public boxPrize(double cost) {
        this.cost = cost;
    }

    public boxPrize(boxPrize old) {
        super(old);
        this.cost = old.cost;
    }

    public boxPrize(double l, double b, double h, double weight, double cost) {
        super(l, b, h, weight);
        this.cost = cost;
    }
}

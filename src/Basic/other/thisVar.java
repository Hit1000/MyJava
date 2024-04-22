package Basic.other;

public class thisVar {
//    this can be used ref the current class instance var
//    this can be used to invoke current class method
//                                       class const
//    this can be pass as ans argument
//    this can be passed in const call
//    this can be used current to return current class instance from the method
    int a,b = 10;
    void display(){
        System.out.println(a+" "+b);
        System.out.println(this.a+" "+this.b);

    }
    void input(int a,int b){
        this.a=a;
        this.b= b;
        this.display();

    }

    public static void main(String[] args) {
        thisVar obj = new thisVar();
        obj.display();
        obj.input(5,4);

    }
}

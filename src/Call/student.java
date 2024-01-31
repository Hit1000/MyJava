package Call;

public class student {
    private int roll_no;
    private String name;
    private double mark;

    public void setRoll_no(int roll_no){
        this.roll_no = roll_no;
    }
    public int getRoll_no(){
        return roll_no;
    }

    public void setMark(double mark){
        this.mark = mark;
    }
    public double getMark(){
        return mark;
    }

    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return "Student : "+name+", "+roll_no+", "+mark;
    }

    public static void main(String[] args) {

    }
}

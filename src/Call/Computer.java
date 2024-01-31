package Call;

class Computer {
    public static void main(String[] args) {
        pc p = new laptop();
        p.display();

    }
}

class pc{
    protected void display(){
        System.out.println("PC");
    }

}

class laptop extends pc{
    public void display(){
        System.out.println("Laptop");
    }
}

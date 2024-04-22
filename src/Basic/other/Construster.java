package Basic.other;

class Construster {
//    special function having same name as class
//    it is called automaticaly when instance of class is created
//    at the time of calling construs memory for a object is allocated in memory
//    every object is created using new keyword at least one const is called

//    there 2 type
//    1 known argument/default cont
//    2 perameter cont

//    java const can't be static and abstact and synonase
//    we can have access modifire while creating
//    public, private, protected, default

    int a,b;
    Construster(){
        a=10;
        b=15;
    }
    Construster(int x,int y){
        a=x;
        b=y;
    }
    void display(){
        System.out.println(a+" "+b);
    }

//there is no copy const in java so there is 3 diff ways to copy
//one obj to another
//    1 by const
//    2 by assing value to other
//    3 by clone method

    Construster(Construster t){
        a=t.a;
        b=t.b;
    }

    public static void main(String[] args) {
        Construster obj = new Construster();
        Construster obj1 = new Construster(3,4);
        Construster obj2 = new Construster(36,34);
        Construster obj_copy = new Construster(obj1);
        Construster obj_copy_1 = new Construster();
        obj_copy_1.a = obj2.a;
        obj_copy_1.b = obj2.b;


//        obj.display();
//        obj1.display();
        obj_copy.display();
        obj_copy_1.display();
    }
}

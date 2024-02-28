package Basic.staticExample;

public class human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        human.population+=1;
    }
    static void display(){
        System.out.println(population+ " this is the population.");
    }
}
